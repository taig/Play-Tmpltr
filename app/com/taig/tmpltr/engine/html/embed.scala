package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	embed( attributes: Attributes )( content: Html )
extends	markup.embed[embed]( attributes )( content )
{
	protected def copy = new embed( _: Attributes )( content )
}

object embed
{
	def apply( attributes: Attributes )( content: Html ): embed = new embed( attributes )( content )

	def apply( content: Html ): embed = apply( Attributes.empty )( content )
}