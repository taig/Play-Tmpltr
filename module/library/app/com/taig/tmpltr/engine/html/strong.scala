package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	strong( attributes: Attributes )( content: Html )
extends	markup.strong[strong]( attributes )( content )
{
	protected def copy = new strong( _: Attributes )( content )
}

object strong
{
	def apply( attributes: (String, String)* )( content: Html ): strong = new strong( attributes )( content )

	def apply( content: Html ): strong = apply()( content )
}