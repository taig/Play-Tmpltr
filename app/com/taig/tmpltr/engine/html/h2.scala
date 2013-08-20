package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h2( attributes: Attributes )( content: Html )
extends	markup.h[h2]( 2, attributes )( content )
{
	protected def copy = new h2( _: Attributes )( content )
}

object h2
{
	def apply( attributes: Attributes )( content: Html ): h2 = new h2( attributes )( content )

	def apply( content: Html ): h2 = apply( Attributes.empty )( content )
}