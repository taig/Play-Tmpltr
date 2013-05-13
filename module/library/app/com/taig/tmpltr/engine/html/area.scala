package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	area( attributes: Attributes )
extends	markup.area[area]( attributes )
{
	protected def copy = new area( _: Attributes )
}

object area
{
	def apply( attributes: (String, String)* ): area = new area( attributes )
}