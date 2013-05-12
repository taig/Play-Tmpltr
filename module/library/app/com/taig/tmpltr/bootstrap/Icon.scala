package com.taig.tmpltr.bootstrap

import com.taig.tmpltr.Tag.Html.Body.Italic
import com.taig.tmpltr._
import play.api.templates.Html

class icon(image: String, color: String, attributes: Attributes) extends Italic[icon](
	attributes ++ ( "class" -> ( "icon" + image ) )
)( Html.empty )
{
	protected def copy = new icon( image, color, _: Attributes )
}

object icon
{
	class Color(color: String) extends Property( "icon" -> "-", color )
}