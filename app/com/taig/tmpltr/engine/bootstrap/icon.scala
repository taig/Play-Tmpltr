package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.templates.Html

class	icon private( attributes: Attributes )
extends	html.span( attributes )( Html.empty )
with	Tag.Empty[icon]
{
	def this( image: String, attributes: Attributes ) = this( attributes ~ ( "class" -> ( "glyphicon", image ) ) )
}

object	icon
extends	property.icon
{
	def apply( image: String, attributes: Attributes = Attributes.empty ) = new icon( image, attributes )
}