package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	cite( attributes: Attributes )( content: Html )
extends	markup.cite[cite]( attributes )( content )
{
	protected def copy = new cite( _: Attributes )( content )
}

object cite
{
	def apply( attributes: Attributes )( content: Html ): cite = new cite( attributes )( content )

	def apply( content: Html ): cite = apply( Attributes.empty )( content )
}