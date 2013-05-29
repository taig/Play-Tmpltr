package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	canvas( attributes: Attributes )( content: Html )
extends	markup.canvas[canvas]( attributes )( content )
{
	protected def copy = new canvas( _: Attributes )( content )
}

object canvas
{
	def apply( attributes: Attributes )( content: Html ): canvas = new canvas( attributes )( content )

	def apply( content: Html ): canvas = apply( Attributes.empty )( content )
}