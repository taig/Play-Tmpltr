package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	fieldset( attributes: Attributes )( content: Html )
extends	markup.fieldset[fieldset]( attributes )( content )
{
	protected def copy = new fieldset( _: Attributes )( content )
}

object fieldset
{
	def apply( attributes: Attributes )( content: Html ): fieldset = new fieldset( attributes )( content )

	def apply( content: Html ): fieldset = apply( Attributes.empty )( content )
}