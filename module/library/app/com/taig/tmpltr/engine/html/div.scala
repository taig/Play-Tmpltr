package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	div( attributes: Attributes )( content: Html )
extends	markup.div[div]( attributes )( content )
{
	protected def copy = new div( _: Attributes )( content )
}

object div
{
	def apply( attributes: (String, String)* )( content: Html ): div = new div( attributes )( content )

	def apply( content: Html ): div = apply( )( content )
}