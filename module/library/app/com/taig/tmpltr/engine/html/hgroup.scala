package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	hgroup( attributes: Attributes )( content: Html )
extends	markup.hgroup[hgroup]( attributes )( content )
{
	protected def copy = new hgroup( _: Attributes )( content )
}

object hgroup
{
	def apply( attributes: Attributes )( content: Html ): hgroup = new hgroup( attributes )( content )

	def apply( content: Html ): hgroup = apply( Attributes.empty )( content )
}