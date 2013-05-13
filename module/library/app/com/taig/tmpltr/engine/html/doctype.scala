package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	doctype
extends	markup.doctype[doctype]( "html" )
{
	protected def copy = ( attributes: Attributes ) => new doctype
}

object doctype
{
	def apply(): doctype = new doctype
}