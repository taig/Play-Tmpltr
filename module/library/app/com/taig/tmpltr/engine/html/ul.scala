package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	ul( attributes: Attributes )( content: Html )
extends	markup.ul[ul]( attributes )( content )
{
	protected def copy = new ul( _: Attributes )( content )
}

object ul
{
	def apply( attributes: (String, String)* )( content: Html ): ul = new ul( attributes )( content )

	def apply( content: Html ): ul = apply()( content )
}