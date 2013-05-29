package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	address( attributes: Attributes )( content: Html )
extends	markup.address[address]( attributes )( content )
{
	protected def copy = new address( _: Attributes )( content )
}

object address
{
	def apply( attributes: Attributes )( content: Html ): address = new address( attributes )( content )

	def apply( content: Html ): address = apply( Attributes.empty )( content )
}