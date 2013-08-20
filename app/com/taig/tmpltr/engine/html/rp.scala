package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	rp( attributes: Attributes )( content: Html )
extends	markup.rp[rp]( attributes )( content )
{
	protected def copy = new rp( _: Attributes )( content )
}

object rp
{
	def apply( attributes: Attributes )( content: Html ): rp = new rp( attributes )( content )

	def apply( content: Html ): rp = apply( Attributes.empty )( content )
}