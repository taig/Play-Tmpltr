package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h4( attributes: Attributes )( content: Html )
extends	markup.h[h4]( 4, attributes )( content )
{
	protected def copy = new h4( _: Attributes )( content )
}

object h4
{
	def apply( attributes: (String, String)* )( content: Html ): h4 = new h4( attributes )( content )

	def apply( content: Html ): h4 = apply()( content )
}