package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	details( attributes: Attributes )( content: Html )
extends	markup.details[details]( attributes )( content )
{
	protected def copy = new details( _: Attributes )( content )
}

object details
{
	def apply( attributes: Attributes )( content: Html ): details = new details( attributes )( content )

	def apply( content: Html ): details = apply( Attributes.empty )( content )
}