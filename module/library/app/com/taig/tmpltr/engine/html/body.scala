package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	body( attributes: Attributes )( content: Html )
extends	markup.body[body]( attributes )( content )
{
	protected def copy = new body( _: Attributes )( content )
}

object body
{
	def apply( attributes: (String, String)* )( content: Html ): body = new body( attributes )( content )

	def apply( content: Html ): body = apply( )( content )
}