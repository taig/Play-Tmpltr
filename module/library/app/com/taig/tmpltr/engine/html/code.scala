package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	code( attributes: Attributes )( content: Html )
extends	markup.code[code]( attributes )( content )
{
	protected def copy = new code( _: Attributes )( content )
}

object code
{
	def apply( attributes: (String, String)* )( content: Html ): code = new code( attributes )( content )

	def apply( content: Html ): code = apply()( content )
}