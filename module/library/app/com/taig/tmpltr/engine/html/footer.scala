package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	footer( attributes: Attributes )( content: Html )
extends	markup.footer[footer]( attributes )( content )
{
	protected def copy = new footer( _: Attributes )( content )
}

object footer
{
	def apply( attributes: (String, String)* )( content: Html ): footer = new footer( attributes )( content )

	def apply( content: Html ): footer = apply()( content )
}