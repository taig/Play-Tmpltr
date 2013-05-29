package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	colgroup( attributes: Attributes )( content: Html )
extends	markup.colgroup[colgroup]( attributes )( content )
{
	protected def copy = new colgroup( _: Attributes )( content )
}

object colgroup
{
	def apply( attributes: Attributes )( content: Html ): colgroup = new colgroup( attributes )( content )

	def apply( content: Html ): colgroup = apply( Attributes.empty )( content )
}