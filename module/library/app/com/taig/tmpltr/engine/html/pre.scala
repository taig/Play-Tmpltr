package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	pre( attributes: Attributes )( content: Html )
extends	markup.pre[pre]( attributes )( content )
{
	protected def copy = new pre( _: Attributes )( content )
}

object pre
{
	def apply( attributes: Attributes )( content: Html ): pre = new pre( attributes )( content )

	def apply( content: Html ): pre = apply( Attributes.empty )( content )
}