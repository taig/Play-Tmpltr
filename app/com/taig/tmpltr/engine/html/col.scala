package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	col( attributes: Attributes )
extends	markup.col[col]( attributes )
{
	protected def copy = new col( _: Attributes )
}

object col
{
	def apply( attributes: Attributes = Attributes.empty ): col = new col( attributes )
}