package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h1( attributes: Attributes )( content: Html )
extends	markup.h[h1]( 1, attributes )( content )
{
	protected def copy = new h1( _: Attributes )( content )
}

object h1
{
	def apply( attributes: Attributes )( content: Html ): h1 = new h1( attributes )( content )

	def apply( content: Html ): h1 = apply( Attributes.empty )( content )
}