package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	tr( attributes: Attributes )( content: Html )
extends	markup.tr[tr]( attributes )( content )
{
	protected def copy = new tr( _: Attributes )( content )
}

object tr
{
	def apply( attributes: Attributes )( content: Html ): tr = new tr( attributes )( content )

	def apply( content: Html ): tr = apply( Attributes.empty )( content )
}