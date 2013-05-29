package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	small( attributes: Attributes )( content: Html )
extends	markup.small[small]( attributes )( content )
{
	protected def copy = new small( _: Attributes )( content )
}

object small
{
	def apply( attributes: Attributes )( content: Html ): small = new small( attributes )( content )

	def apply( content: Html ): small = apply( Attributes.empty )( content )
}