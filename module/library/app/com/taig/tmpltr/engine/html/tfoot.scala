package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	tfoot( attributes: Attributes )( content: Html )
extends	markup.tfoot[tfoot]( attributes )( content )
{
	protected def copy = new tfoot( _: Attributes )( content )
}

object tfoot
{
	def apply( attributes: (String, String)* )( content: Html ): tfoot = new tfoot( attributes )( content )

	def apply( content: Html ): tfoot = apply()( content )
}