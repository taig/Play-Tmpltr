package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	li( attributes: Attributes )( content: Html )
extends	markup.li[li]( attributes )( content )
{
	protected def copy = new li( _: Attributes )( content )
}

object li
{
	def apply( attributes: (String, String)* )( content: Html ): li = new li( attributes )( content )

	def apply( content: Html ): li = apply()( content )
}