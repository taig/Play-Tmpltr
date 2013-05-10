package com.taig.bootstrapper

class Label(text: String, `for`: Option[String], attributes: Attributes) extends HtmlNode[Label](
	<label for={`for`}>
		{text}
	</label>, attributes
)
{
	def %(attributes: Attributes) = new Label( text, `for`, this.attributes ++ attributes )
}