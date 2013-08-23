package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

class	image( shape: image.shape, responsive: Boolean, attributes: Attributes )
extends markup.img[image]( attributes ~ ( "class" -> ( shape, if( responsive ) { "img-responsive" } else { None } ) ) )
{
	protected def copy = new image( shape, responsive, _: Attributes )
}

object	image
extends	property.image
{
	def apply( shape: shape = image.shape.default, responsive: Boolean = false, attributes: Attributes = Attributes.empty ) =
	{
		new image( shape, responsive, attributes )
	}
}