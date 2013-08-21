package views

import play.api.templates.{Txt, HtmlFormat, Html}
import scala.xml.{Node, NodeSeq}

trait Code extends NodeSeq
{
	def theSeq: Seq[Node] = NodeSeq.Empty

	val language = "scala"

	val code: String

	val result: Option[String]

	val preview: Option[String]

	protected implicit def stringToOption( string: String ): Option[String] = Some( string )

	override def toString = Code.Format( code, language, true ) +
		result.fold( "" )( Code.Format( _, "xml", true ).toString ) +
		preview.fold( "" )( Code.Format( _, None, false ).toString )
}

object Code
{
	case class Format( code: String, language: Option[String], escape: Boolean )
	{
		override def toString =
		{
			"<pre class=\"code" + language.map( " language-" + _ ).getOrElse( "" ) + "\">" +
				( if( escape ) { HtmlFormat.escape( code.trim ).toString } else { code } ) +
			"</pre>"
		}
	}
}