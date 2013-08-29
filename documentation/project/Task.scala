import play.templates._
import play.templates.ScalaTemplateCompiler._
import sbt._
import sbt.PlayExceptions.TemplateCompilationException
import sbt.PlaySourceGenerators.reportCompilationError
import scalax.file.Path

object Task
{
	val ScalaTemplates = ( state: State, sourceDirectory: File, generatedDir: File, templateTypes: Map[String, String], additionalImports: Seq[String] ) =>
	{
		val templateExt: PartialFunction[File, (File, String, String)] =
		{
			case p if templateTypes.contains( p.name.split('.').last ) =>
			{
				val extension = p.name.split('.').last
				val exts = templateTypes(extension)
				( p, extension, exts )
			}
		}

		( generatedDir ** "*.template.scala" ).get.map( GeneratedSource ).foreach( _.sync() )

		try
		{
			( sourceDirectory ** "*.scala.*" ).get.collect( templateExt ).foreach
			{
				case ( template, extension, format ) =>
				{
					compile(
						template,
						sourceDirectory,
						generatedDir,
						format,
						additionalImports.map( "import " + _.replace( "%format%", extension ) ).mkString( "\n" )
					)
				}
			}
		}
		catch
		{
			case TemplateCompilationError( source, message, line, column ) =>
			{
				throw reportCompilationError( state, TemplateCompilationException( source, message, line, column - 1 ) )
			}
		}

		( generatedDir ** "*.template.scala" ).get.map( _.getAbsoluteFile )
	}
	
	def compile( source: File, sourceDirectory: File, generatedDirectory: File, formatterType: String, additionalImports: String = "" ) =
	{
		val resultType = formatterType + ".Appendable"
		val ( templateName, generatedSource ) = generatedFile( source, sourceDirectory, generatedDirectory )

		if( generatedSource.needRecompilation( additionalImports ) )
		{
			val generated = parseAndGenerateCode( templateName, Path( source ).byteArray, source.getAbsolutePath, resultType, formatterType, additionalImports )
			Path( generatedSource.file ).write( generated.toString.replace( "BaseScalaTemplate", "com.taig.tmpltr.Template" ) )
			Some( generatedSource.file )
		}
		else
		{
			None
		}
	}
}