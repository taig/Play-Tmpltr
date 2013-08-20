package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	base( attributes: Attributes )
extends	markup.base[base]( attributes )
{
	def this( href: Option[String], target: Option[base.target], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "href" -> href, "target" -> target ) )
	}

	protected def copy = new base( _: Attributes )
}

object base extends property.a
{
	def apply( href: Option[String] = None, target: Option[target] = None, attributes: Attributes = Attributes.empty ): base =
	{
		new base( href, target, attributes )
	}

	def apply( attributes: Attributes ): base = apply( None, None, attributes )
}