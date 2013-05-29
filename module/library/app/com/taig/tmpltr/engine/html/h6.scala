package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h6( attributes: Attributes )( content: Html )
extends	markup.h[h6]( 6, attributes )( content )
{
	protected def copy = new h6( _: Attributes )( content )
}

object h6
{
	def apply( attributes: Attributes )( content: Html ): h6 = new h6( attributes )( content )

	def apply( content: Html ): h6 = apply( Attributes.empty )( content )
}