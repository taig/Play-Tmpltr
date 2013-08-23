package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	icon( image: icon.image, attributes: Attributes )
extends	markup.span[icon]( attributes ~ ( "class" -> ( "glyphicon", image ) ) )( Html.empty )
{
	protected def copy = new icon( image, _: Attributes )
}

object	icon
extends property.icon
{
	def apply( image: String, attributes: Attributes = Attributes.empty ) = new icon( new image( image ), attributes )
}