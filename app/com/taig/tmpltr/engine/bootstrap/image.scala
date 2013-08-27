package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import com.taig.tmpltr.engine.html

class	image private( attributes: Attributes )
extends html.img( attributes )
with	Tag.Empty[image]
{
	def this( shape: Option[image.shape], responsive: Boolean, attributes: Attributes ) =
	{
		this( attributes ~ ( "class" -> ( shape, if( responsive ) "img-responsive" else None ) ) )
	}
}

object	image
extends	property.image
{
	def apply( shape: Option[shape] = None, responsive: Boolean = false, attributes: Attributes = Attributes.empty ) =
	{
		new image( shape, responsive, attributes )
	}
}