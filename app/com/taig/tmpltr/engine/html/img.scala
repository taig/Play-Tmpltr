package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	img( src: Option[String], alt: Option[String],  attributes: Attributes )
extends	markup.img[img]( attributes ~~ ( ( "src" -> src, "alt" -> alt ) ) )
{
	protected def copy = new img( src, alt, _: Attributes )
}

object img
{
	def apply( src: Option[String] = None, alt: Option[String] = None, attributes: Attributes ): img =
	{
		new img( src, alt, attributes )
	}

	def apply( attributes: Attributes ): img = apply( None, None, attributes )
}