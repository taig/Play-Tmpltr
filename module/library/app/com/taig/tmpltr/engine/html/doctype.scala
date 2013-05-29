package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	doctype
extends	markup.doctype[doctype]( "html" )
{
	protected def copy = ( _: Attributes ) => new doctype
}

object doctype
{
	def apply(): doctype = new doctype
}