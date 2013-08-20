package views

import play.api.templates.{Txt, HtmlFormat, Html}
import scala.xml.{Node, NodeSeq}

trait Code extends NodeSeq
{
	def theSeq: Seq[Node] = NodeSeq.Empty

	val lang = "scala"

	val code: String

	val result: Option[String]

	val preview: Option[String]

	protected implicit def stringToOption( string: String ): Option[String] = Some( string )

	override def toString =
		"<pre class=\"prettyprint linenums lang-" + lang + "\">" + HtmlFormat.escape( code.trim ) + "</pre>" +
		result.fold( "" ) { result =>
			"<pre class=\"prettyprint linenums lang-html\">" + HtmlFormat.escape( result.trim ) + "</pre>"
		} + preview.fold( "" ) {
			"<div class=\"code-preview\">" + _ + "</div>"
		}
}