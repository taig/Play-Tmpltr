//package com.taig.bootstrapper.bootstrap
//
//import com.taig.bootstrapper.{HtmlNode, Attributes}
//
//class Label(text: String, `for`: Option[String], attributes: Attributes) extends HtmlNode[Label](
//	<label for={`for`}>
//		{text}
//	</label>, attributes
//)
//{
//	def %(attributes: Attributes) = new Label( text, `for`, this.attributes ++ attributes )
//}