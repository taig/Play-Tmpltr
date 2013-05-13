package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	tbody( attributes: Attributes )( content: Html )
extends	markup.tbody[tbody]( attributes )( content )
{
	protected def copy = new tbody( _: Attributes )( content )
}

object tbody
{
	def apply( attributes: (String, String)* )( content: Html ): tbody = new tbody( attributes )( content )

	def apply( content: Html ): tbody = apply()( content )
}