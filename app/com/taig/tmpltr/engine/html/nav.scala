package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	nav( attributes: Attributes )( content: Html )
extends	markup.nav[nav]( attributes )( content )
{
	protected def copy = new nav( _: Attributes )( content )
}

object nav
{
	def apply( attributes: Attributes )( content: Html ): nav = new nav( attributes )( content )

	def apply( content: Html ): nav = apply( Attributes.empty )( content )
}