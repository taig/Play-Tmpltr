package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	hr( attributes: Attributes )
extends	markup.hr[hr]( attributes )
{
	protected def copy = new hr( _: Attributes )
}

object hr
{
	def apply( attributes: (String, String)* ): hr = new hr( attributes )
}