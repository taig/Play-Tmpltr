package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	s( attributes: Attributes )( content: Html )
extends	markup.s[s]( attributes )( content )
{
	protected def copy = new s( _: Attributes )( content )
}

object s
{
	def apply( attributes: (String, String)* )( content: Html ): s = new s( attributes )( content )

	def apply( content: Html ): s = apply()( content )
}