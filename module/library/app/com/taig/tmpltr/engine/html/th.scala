package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	th( attributes: Attributes )( content: Html )
extends	markup.th[th]( attributes )( content )
{
	protected def copy = new th( _: Attributes )( content )
}

object th
{
	def apply( attributes: Attributes )( content: Html ): th = new th( attributes )( content )

	def apply( content: Html ): th = apply( Attributes.empty )( content )
}