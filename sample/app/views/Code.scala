package views

import play.api.templates.{HtmlFormat, Html}
import scala.xml.{Node, NodeSeq}

trait Code extends NodeSeq
{
	def theSeq: Seq[Node] = NodeSeq.Empty

	val code: String

	val lang = "scala"

	val preview: Option[String]

	protected implicit def stringToOption( string: String ): Option[String] = Some( string )

	override def toString =
		"<pre class=\"prettyprint linenums lang-" + lang + "\">" +
			HtmlFormat.escape( code.trim ) +
		"</pre>" + preview.getOrElse( "" )
}