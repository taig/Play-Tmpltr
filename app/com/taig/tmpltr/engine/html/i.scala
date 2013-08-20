package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	i( attributes: Attributes )( content: Html )
extends	markup.i[i]( attributes )( content )
{
	protected def copy = new i( _: Attributes )( content )
}

object i
{
	def apply( attributes: Attributes )( content: Html ): i = new i( attributes )( content )

	def apply( content: Html ): i = apply( Attributes.empty )( content )
}