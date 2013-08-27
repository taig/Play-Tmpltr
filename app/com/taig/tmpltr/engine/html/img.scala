package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	img( val attributes: Attributes )
extends	markup.img
with	Tag.Empty[img]
{
	def this( src: Option[String], alt: Option[String], attributes: Attributes ) =
	{
		this( attributes ~~ ( ( "src" -> src, "alt" -> alt ) ) )
	}
}

object	img
extends	Tag.Empty.Appliable[img]
{
	def apply( src: Option[String] = None, alt: Option[String] = None, attributes: Attributes = Attributes.empty ): img =
	{
		new img( src, alt, attributes )
	}
}