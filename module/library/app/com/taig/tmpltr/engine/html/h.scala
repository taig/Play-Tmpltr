package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	h( level: Int, attributes: Attributes )( content: Html )
extends markup.h[h]( level, attributes )( content )
{
	protected def copy = new h( level, _: Attributes )( content )
}

object h
{
	def apply( level: Int = 1, attributes: Attributes = Attributes.empty )( content: Html ): h = new h( level, attributes )( content )

	def apply( content: Html ): h = apply()( content )
}