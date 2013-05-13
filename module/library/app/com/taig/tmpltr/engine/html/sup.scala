package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	sup( attributes: Attributes )( content: Html )
extends	markup.sup[sup]( attributes )( content )
{
	protected def copy = new sup( _: Attributes )( content )
}

object sup
{
	def apply( attributes: (String, String)* )( content: Html ): sup = new sup( attributes )( content )

	def apply( content: Html ): sup = apply()( content )
}