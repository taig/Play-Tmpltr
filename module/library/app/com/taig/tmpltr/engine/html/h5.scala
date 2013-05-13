package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h5( attributes: Attributes )( content: Html )
extends	markup.h[h5]( 1, attributes )( content )
{
	protected def copy = new h5( _: Attributes )( content )
}

object h5
{
	def apply( attributes: (String, String)* )( content: Html ): h5 = new h5( attributes )( content )

	def apply( content: Html ): h5 = apply()( content )
}