package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	thead( attributes: Attributes )( content: Html )
extends	markup.thead[thead]( attributes )( content )
{
	protected def copy = new thead( _: Attributes )( content )
}

object thead
{
	def apply( attributes: Attributes )( content: Html ): thead = new thead( attributes )( content )

	def apply( content: Html ): thead = apply( Attributes.empty )( content )
}