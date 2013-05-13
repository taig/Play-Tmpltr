package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	rt( attributes: Attributes )( content: Html )
extends	markup.rt[rt]( attributes )( content )
{
	protected def copy = new rt( _: Attributes )( content )
}

object rt
{
	def apply( attributes: (String, String)* )( content: Html ): rt = new rt( attributes )( content )

	def apply( content: Html ): rt = apply()( content )
}