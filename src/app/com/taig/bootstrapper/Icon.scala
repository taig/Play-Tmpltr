package com.taig.bootstrapper

class Icon(image: String, color: Icon.Color, attributes: Attributes) extends HtmlNode[Icon](
	<i class={"icon-" + image + " " + color}></i>,
	attributes
){
	def %(attributes: Attributes) = new Icon( image, color, this.attributes ++ attributes )
}

object Icon
{
	abstract sealed class Color(identifier: Option[String]) extends Property( "icon", identifier )
	object Color
	{
		case object Black extends Color( None )
		case object White extends Color( "white" )
	}
}