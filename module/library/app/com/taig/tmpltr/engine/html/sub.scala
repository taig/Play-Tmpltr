package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	sub( attributes: Attributes )( content: Html )
extends	markup.sub[sub]( attributes )( content )
{
	protected def copy = new sub( _: Attributes )( content )
}

object sub
{
	def apply( attributes: (String, String)* )( content: Html ): sub = new sub( attributes )( content )

	def apply( content: Html ): sub = apply()( content )
}