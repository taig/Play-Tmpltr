package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	figure( attributes: Attributes )( content: Html )
extends	markup.figure[figure]( attributes )( content )
{
	protected def copy = new figure( _: Attributes )( content )
}

object figure
{
	def apply( attributes: Attributes )( content: Html ): figure = new figure( attributes )( content )

	def apply( content: Html ): figure = apply( Attributes.empty )( content )
}