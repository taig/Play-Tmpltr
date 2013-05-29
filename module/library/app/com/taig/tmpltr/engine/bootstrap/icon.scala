package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	icon private( attributes: Attributes )
extends	markup.i[icon]( attributes )( Html.empty )
{
	def this( image: icon.image, color: icon.color, attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "class" -> Seq[Option[_]]( image, color ) ) )
	}

	protected def copy = new icon( _: Attributes )
}

object	icon
extends property.icon
{
	def apply( image: String, color: color = icon.color.black, attributes: Attributes = Attributes.empty ): icon =
	{
		new icon( new image( image ), color, attributes )
	}
}