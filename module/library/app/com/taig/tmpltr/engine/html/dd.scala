package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	dd( attributes: Attributes )( content: Html )
extends	markup.dd[dd]( attributes )( content )
{
	protected def copy = new dd( _: Attributes )( content )
}

object dd
{
	def apply( attributes: (String, String)* )( content: Html ): dd = new dd( attributes )( content )

	def apply( content: Html ): dd = apply()( content )
}