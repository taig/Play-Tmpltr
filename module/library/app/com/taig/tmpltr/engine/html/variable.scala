package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	variable( attributes: Attributes )( content: Html )
extends	markup.variable[variable]( attributes )( content )
{
	protected def copy = new variable( _: Attributes )( content )
}

object variable
{
	def apply( attributes: (String, String)* )( content: Html ): variable = new variable( attributes )( content )

	def apply( content: Html ): variable = apply()( content )
}