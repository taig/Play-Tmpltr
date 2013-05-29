package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	section( attributes: Attributes )( content: Html )
extends	markup.section[section]( attributes )( content )
{
	protected def copy = new section( _: Attributes )( content )
}

object section
{
	def apply( attributes: Attributes )( content: Html ): section = new section( attributes )( content )

	def apply( content: Html ): section = apply( Attributes.empty )( content )
}