package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	td( attributes: Attributes )( content: Html )
extends	markup.td[td]( attributes )( content )
{
	protected def copy = new td( _: Attributes )( content )
}

object td
{
	def apply( attributes: (String, String)* )( content: Html ): td = new td( attributes )( content )

	def apply( content: Html ): td = apply()( content )
}