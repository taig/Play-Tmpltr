package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	b( attributes: Attributes )( content: Html )
extends	markup.b[b]( attributes )( content )
{
	protected def copy = new b( _: Attributes )( content )
}

object b
{
	def apply( attributes: (String, String)* )( content: Html ): b = new b( attributes )( content )

	def apply( content: Html ): b = apply()( content )
}