package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	u( attributes: Attributes )( content: Html )
extends	markup.u[u]( attributes )( content )
{
	protected def copy = new u( _: Attributes )( content )
}

object u
{
	def apply( attributes: (String, String)* )( content: Html ): u = new u( attributes )( content )

	def apply( content: Html ): u = apply()( content )
}