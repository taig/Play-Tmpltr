package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	dl( attributes: Attributes )( content: Html )
extends	markup.dl[dl]( attributes )( content )
{
	protected def copy = new dl( _: Attributes )( content )
}

object dl
{
	def apply( attributes: (String, String)* )( content: Html ): dl = new dl( attributes )( content )

	def apply( content: Html ): dl = apply()( content )
}