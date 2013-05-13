package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	aside( attributes: Attributes )( content: Html )
extends	markup.aside[aside]( attributes )( content )
{
	protected def copy = new aside( _: Attributes )( content )
}

object aside
{
	def apply( attributes: (String, String)* )( content: Html ): aside = new aside( attributes )( content )

	def apply( content: Html ): aside = apply( )( content )
}