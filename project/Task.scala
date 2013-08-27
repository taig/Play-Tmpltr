import java.lang.reflect.InvocationTargetException
import java.net.URLClassLoader
import sbt._

object Task
{
	lazy val ScalaTemplates = ( classpath: Seq[Attributed[File]], templateEngine: File, sourceDirectory: File, generatedDir: File, streams: sbt.std.TaskStreams[sbt.Project.ScopedKey[_]] ) =>
	{
		// Parent classloader must be null to ensure that we get the right scala on the classpath
		val classLoader = new URLClassLoader( classpath.map( _.data.toURI.toURL ).toArray, null )
		val compiler = classLoader.loadClass( "play.templates.ScalaTemplateCompiler" )
		val generatedSource = classLoader.loadClass( "play.templates.GeneratedSource" )

		(generatedDir ** "*.template.scala").get.foreach( source =>
		{
			val constructor = generatedSource.getDeclaredConstructor( classOf[File] )
			val sync = generatedSource.getDeclaredMethod( "sync" )
			val generated = constructor.newInstance( source )
			
			try
			{
				sync.invoke( generated )
			}
			catch
			{
				case exception: InvocationTargetException =>
				{
					val target = exception.getTargetException
					target.printStackTrace
					throw target
				}
			}
		} )

		( sourceDirectory ** "*.scala.html" ).get.foreach( template =>
		{
			val compile = compiler.getDeclaredMethod(
				"compile",
				classOf[File],
				classOf[File],
				classOf[File],
				classOf[String],
				classOf[String]
			)

			try
			{
				compile.invoke(
					null,
					template,
					sourceDirectory,
					generatedDir,
					"play.api.templates.HtmlFormat",
					"import play.api.templates._\nimport play.api.templates.PlayMagic._"
				)
			}
			catch
			{
				case exception: InvocationTargetException =>
				{
					streams.log.error( "Compilation failed for %s".format( template ) )
					throw exception.getTargetException
				}
			}
		} )

		( generatedDir ** "*.scala" ).get.map( _.getAbsoluteFile )
	}
}