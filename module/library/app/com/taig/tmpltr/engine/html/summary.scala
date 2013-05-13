package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	summary( attributes: Attributes )( content: Html )
extends	markup.summary[summary]( attributes )( content )
{
	protected def copy = new summary( _: Attributes )( content )
}

object summary
{
	def apply( attributes: (String, String)* )( content: Html ): summary = new summary( attributes )( content )

	def apply( content: Html ): summary = apply()( content )
}