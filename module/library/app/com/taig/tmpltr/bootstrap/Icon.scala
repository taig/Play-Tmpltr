package com.taig.tmpltr.bootstrap

import com.taig.tmpltr.Tag.Html.Body.Italic
import com.taig.tmpltr._
import play.api.templates.Html
import com.taig.tmpltr.bootstrap.icon.Color
import com.taig.tmpltr.bootstrap.icon.Image

class icon(image: Image, color: Color, attributes: Attributes) extends Italic[icon](
	attributes ++ ( "class" -> ( image + " " + color ) )
)( Html.empty )
{
	protected def copy = new icon( image, color, _: Attributes )
}

object icon
{
	def apply(image: String, color: Color, attributes: (String, String)*): icon =
	{
		new icon( new Image( image ), color, attributes )
	}

	def apply(image: String, attributes: (String, String)*): icon = apply( image, Color.Black, attributes: _* )

	class Image(image: String) extends Property( "icon" -> "-", image )

	class Color(color: Option[String]) extends Property( "icon" -> "-", color )
	object Color
	{
		object Black extends Color( None )
		object White extends Color( "white" )
	}
}