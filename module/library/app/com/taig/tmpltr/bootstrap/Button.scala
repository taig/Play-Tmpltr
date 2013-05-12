//package com.taig.tmpltr.bootstrap
//
//import scala.xml.Text
//import Button.{Size, Style}
//
//class Button(caption: Option[String], url: String, size: Size, style: Style, icon: Option[Icon], attributes: Attributes) extends HtmlNode[Button](
//	<a href={url} class={"btn " + style + " " + size}>
//		{icon.orNull}{caption.map( " " + Text( _ ) ).orNull}
//	</a>, attributes
//){
//	def %(attributes: Attributes) = new Button( label, url, size, style, icon, this.attributes ++ attributes )
//}
//
//object Button
//{
//	class Size(identifier: Option[String]) extends Property( "btn", identifier )
//	class Style(identifier: Option[String]) extends Property( "btn", identifier )
//}