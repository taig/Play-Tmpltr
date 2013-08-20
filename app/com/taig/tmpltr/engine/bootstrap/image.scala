package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.{ markup, Attributes }

class	image( attributes: Attributes )
extends markup.img[image]( attributes )
{
	def this( shape: image.shape, responsive: Boolean, attributes: Attributes ) =
	{
		this( attributes ++  Attributes( "class" -> Seq[Option[_]](
			shape,
			if( responsive ) { "img-responsive" } else { None } ) ) )
	}

	protected def copy = new image( _: Attributes )
}

object	image
extends	property.image
{
	def apply( shape: shape = image.shape.default, responsive: Boolean = false, attributes: Attributes = Attributes.empty ): image =
	{
		new image( shape, responsive, attributes )
	}
}