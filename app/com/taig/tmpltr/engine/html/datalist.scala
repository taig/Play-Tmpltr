package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	datalist( attributes: Attributes )( content: Html )
extends	markup.datalist[datalist]( attributes )( content )
{
	protected def copy = new datalist( _: Attributes )( content )
}

object datalist
{
	def apply( attributes: Attributes )( content: Html ): datalist = new datalist( attributes )( content )

	def apply( content: Html ): datalist = apply( Attributes.empty )( content )
}