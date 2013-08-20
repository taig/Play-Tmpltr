package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	icon private( attributes: Attributes )
extends	markup.span[icon]( attributes )( Html.empty )
{
	def this( image: icon.image, attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "class" -> Seq[Option[_]]( "glyphicon", image ) ) )
	}

	protected def copy = new icon( _: Attributes )
}

object	icon
extends property.icon
{
	def apply( image: String, attributes: Attributes = Attributes.empty ): icon =
	{
		new icon( new image( image ), attributes )
	}
}