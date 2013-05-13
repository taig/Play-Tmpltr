package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	html( attributes: Attributes )( content: Html )
extends	markup.html[html]( attributes )( content )
{
	protected def copy = new html( _: Attributes )( content )
}

object html
{
	def apply( attributes: (String, String)* )( content: Html ): html = new html( attributes )( content )

	def apply( content: Html ): html = apply()( content )
}