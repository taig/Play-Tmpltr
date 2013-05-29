package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	blockquote( attributes: Attributes )( content: Html )
extends	markup.blockquote[blockquote]( attributes )( content )
{
	protected def copy = new blockquote( _: Attributes )( content )
}

object blockquote
{
	def apply( attributes: Attributes )( content: Html ): blockquote = new blockquote( attributes )( content )

	def apply( content: Html ): blockquote = apply( Attributes.empty )( content )
}