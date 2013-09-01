package views

import play.api.templates.HtmlFormat
import scala.xml.{ Node, NodeSeq }

trait Code extends NodeSeq
{
	def theSeq: Seq[Node] = NodeSeq.Empty

	val language = "scala"

	val code: String

	val result: Option[String]

	val preview: Option[String]

	protected implicit def optionFromString( string: String ): Option[String] = Some( string )

	override def toString =
	{
		"<div class=\"examples\">" +
			Code.Format( "Code", code, language, true ) +
			result.map( Code.Format( "Result", _, "xml", true ) ).getOrElse( "" ) +
			preview.map( Code.Format( "Preview", _, None, false ) ).getOrElse( "" ) +
		"</div>"
	}
}

object Code
{
	case class Format( label: String, code: String, language: Option[String], escape: Boolean )
	{
		override def toString =
		{
			"<div class=\"example\">" +
				"<span class=\"label\">" + label + "</span>" +
				"<pre class=\"" + language.map( " language-" + _ ).getOrElse( "" ) + "\">" +
					( if( escape ) { HtmlFormat.escape( code.trim ).toString } else { code } ) +
				"</pre>" +
			"</div>"
		}
	}
}