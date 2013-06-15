package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	img( attributes: Attributes )
extends	markup.img[img]( attributes )
{
	def this( src: Option[String], alt: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "src" -> src, "alt" -> alt ) )
	}

	protected def copy = new img( _: Attributes )
}

object img
{
	def apply( src: Option[String] = None, alt: Option[String] = None, attributes: Attributes ): img =
	{
		new img( src, alt, attributes )
	}

	def apply( attributes: Attributes ): img = apply( None, None, attributes )
}