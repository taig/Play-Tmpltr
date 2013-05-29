package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	mark( attributes: Attributes )( content: Html )
extends	markup.mark[mark]( attributes )( content )
{
	protected def copy = new mark( _: Attributes )( content )
}

object mark
{
	def apply( attributes: Attributes )( content: Html ): mark = new mark( attributes )( content )

	def apply( content: Html ): mark = apply( Attributes.empty )( content )
}