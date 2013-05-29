package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	figcaption( attributes: Attributes )( content: Html )
extends	markup.figcaption[figcaption]( attributes )( content )
{
	protected def copy = new figcaption( _: Attributes )( content )
}

object figcaption
{
	def apply( attributes: Attributes )( content: Html ): figcaption = new figcaption( attributes )( content )

	def apply( content: Html ): figcaption = apply( Attributes.empty )( content )
}