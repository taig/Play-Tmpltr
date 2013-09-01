package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	base( val attributes: Attributes )
extends	markup.base
with	Tag.Empty[base]
{
	def this( href: Option[String], target: Option[base.target], attributes: Attributes ) =
	{
		this( attributes ~~ ( ( "href" -> href, "target" -> target ) ) )
	}
}

object	base
extends	Tag.Empty.Appliable[base]
with	property.a
{
	def apply( href: Option[String] = None, target: Option[target] = None, attributes: Attributes = Attributes.empty ) =
	{
		new base( href, target, attributes )
	}
}