package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	dfn( attributes: Attributes )( content: Html )
extends	markup.dfn[dfn]( attributes )( content )
{
	protected def copy = new dfn( _: Attributes )( content )
}

object dfn
{
	def apply( attributes: Attributes )( content: Html ): dfn = new dfn( attributes )( content )

	def apply( content: Html ): dfn = apply( Attributes.empty )( content )
}