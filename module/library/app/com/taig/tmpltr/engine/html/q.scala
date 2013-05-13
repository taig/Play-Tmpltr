package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	q( attributes: Attributes )( content: Html )
extends	markup.q[q]( attributes )( content )
{
	protected def copy = new q( _: Attributes )( content )
}

object q
{
	def apply( attributes: (String, String)* )( content: Html ): q = new q( attributes )( content )

	def apply( content: Html ): q = apply()( content )
}