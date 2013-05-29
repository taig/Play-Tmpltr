package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h3( attributes: Attributes )( content: Html )
extends	markup.h[h3]( 3, attributes )( content )
{
	protected def copy = new h3( _: Attributes )( content )
}

object h3
{
	def apply( attributes: Attributes )( content: Html ): h3 = new h3( attributes )( content )

	def apply( content: Html ): h3 = apply( Attributes.empty )( content )
}