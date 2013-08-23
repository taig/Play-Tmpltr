package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	doctype
extends	markup.doctype[doctype]( "html" )
{
	protected def copy = ( _: Attributes ) => new doctype
}

object doctype
{
	def apply(): doctype = new doctype
}