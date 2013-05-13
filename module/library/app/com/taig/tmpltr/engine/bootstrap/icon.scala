package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	icon private( attributes: Attributes )
extends	markup.i[icon]( attributes )( Html.empty )
{
	def this( image: icon.image, color: icon.color, attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "class" -> image ) )
	}

	protected def copy = new icon( _: Attributes )
}

object	icon
extends property.icon
{
	def apply( image: String, color: color, attributes: (String, String)* ): icon =
	{
		new icon( new image( image ), color, attributes )
	}

	def apply( image: String, attributes: (String, String)* ): icon = apply( image, color.black, attributes: _* )
}