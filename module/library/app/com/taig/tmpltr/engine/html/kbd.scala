package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	kbd( attributes: Attributes )( content: Html )
extends	markup.kbd[kbd]( attributes )( content )
{
	protected def copy = new kbd( _: Attributes )( content )
}

object kbd
{
	def apply( attributes: (String, String)* )( content: Html ): kbd = new kbd( attributes )( content )

	def apply( content: Html ): kbd = apply()( content )
}