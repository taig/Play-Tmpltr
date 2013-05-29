package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	p( attributes: Attributes )( content: Html )
extends	markup.p[p]( attributes )( content )
{
	protected def copy = new p( _: Attributes )( content )
}

object p
{
	def apply( attributes: Attributes )( content: Html ): p = new p( attributes )( content )

	def apply( content: Html ): p = apply( Attributes.empty )( content )
}