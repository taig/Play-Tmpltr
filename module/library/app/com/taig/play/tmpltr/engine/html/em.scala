package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	em( attributes: Attributes )( content: Html )
extends	markup.em[em]( attributes )( content )
{
	protected def copy = new em( _: Attributes )( content )
}

object em
{
	def apply( attributes: Attributes )( content: Html ): em = new em( attributes )( content )

	def apply( content: Html ): em = apply( Attributes.empty )( content )
}