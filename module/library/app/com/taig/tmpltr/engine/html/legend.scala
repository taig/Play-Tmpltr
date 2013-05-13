package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	legend( attributes: Attributes )( content: Html )
extends	markup.legend[legend]( attributes )( content )
{
	protected def copy = new legend( _: Attributes )( content )
}

object legend
{
	def apply( attributes: (String, String)* )( content: Html ): legend = new legend( attributes )( content )

	def apply( content: Html ): legend = apply()( content )
}