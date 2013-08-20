package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	noscript( attributes: Attributes )( content: Html )
extends	markup.noscript[noscript]( attributes )( content )
{
	protected def copy = new noscript( _: Attributes )( content )
}

object noscript
{
	def apply( attributes: Attributes )( content: Html ): noscript = new noscript( attributes )( content )

	def apply( content: Html ): noscript = apply( Attributes.empty )( content )
}