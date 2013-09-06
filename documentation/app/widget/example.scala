package widget

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content
import play.api.templates.{HtmlFormat, Html}

class	example /*private*/( attributes: Attributes, content: Content )
extends	html.div( attributes ~ ( "class" -> "code-example" ), content )
with	Tag.Body[example, Content]
{
	def this( attributes: Attributes, code: example.source, result: Option[example.result], preview: Option[Content] ) =
	{
		this( attributes, code += result.map( _.toHtml ).getOrElse( Html.empty ) += preview.getOrElse( Html.empty ) )
	}
}

object example
{
	def apply( code: example.source, result: Option[example.result] = None, preview: Option[Content] = None, attributes: Attributes = Attributes.empty ): example =
	{
		new example( attributes, code, result, preview )
	}

	abstract class	code[A <: code[A]]( title: String, language: Option[String], attributes: Attributes, content: Content )
	extends			html.div( attributes ~ ( "class" -> "highlight" ), html.span( "class" -> "label" )( title ).toString + html.pre( html.code( "class" -> language.map( "language-" + _ ).getOrElse( "no-highlight" ) )( HtmlFormat.escape( content.body ) ) ) )
	with			Tag.Body[A, Content]

	class	source( language: Option[String], attributes: Attributes, content: Content )
	extends	code[source]( "Source", language, attributes, content )
	{
		/*private*/ def this( attributes: Attributes, content: Content ) =
		{
			this( None, attributes, content )
		}
	}

	object	source
	extends	Tag.Body.Appliable[source, Content]
	{
		def apply( language: String, attributes: Attributes = Attributes.empty )( content: Content ) =
		{
			new source( language, attributes, content )
		}
	}

	class	result( language: Option[String], attributes: Attributes, content: Content )
	extends	code( "Result", language, attributes, content )
	{
		/*private*/ def this( attributes: Attributes, content: Content ) =
		{
			this( None, attributes, content )
		}
	}

	object	result
	extends	Tag.Body.Appliable[result, Content]
	{
		def apply( language: String, attributes: Attributes = Attributes.empty )( content: Content ) =
		{
			new result( language, attributes, content )
		}
	}
}