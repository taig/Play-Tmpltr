package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	base( href: Option[String], target: Option[base.target], attributes: Attributes )
extends	markup.base[base]( attributes ~~ ( ( "href" -> href, "target" -> target ) ) )
{
	protected def copy = new base( href, target, _: Attributes )
}

object base extends property.a
{
	def apply( href: Option[String] = None, target: Option[target] = None, attributes: Attributes = Attributes.empty ): base =
	{
		new base( href, target, attributes )
	}

	def apply( attributes: Attributes ): base = apply( None, None, attributes )
}