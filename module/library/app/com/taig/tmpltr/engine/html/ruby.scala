package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	ruby( attributes: Attributes )( content: Html )
extends	markup.ruby[ruby]( attributes )( content )
{
	protected def copy = new ruby( _: Attributes )( content )
}

object ruby
{
	def apply( attributes: (String, String)* )( content: Html ): ruby = new ruby( attributes )( content )

	def apply( content: Html ): ruby = apply()( content )
}