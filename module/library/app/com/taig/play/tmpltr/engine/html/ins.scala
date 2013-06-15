package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	ins( attributes: Attributes )( content: Html )
extends	markup.ins[ins]( attributes )( content )
{
	protected def copy = new ins( _: Attributes )( content )
}

object ins
{
	def apply( attributes: Attributes )( content: Html ): ins = new ins( attributes )( content )

	def apply( content: Html ): ins = apply( Attributes.empty )( content )
}