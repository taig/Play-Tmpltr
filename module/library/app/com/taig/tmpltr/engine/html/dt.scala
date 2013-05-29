package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	dt( attributes: Attributes )( content: Html )
extends	markup.dt[dt]( attributes )( content )
{
	protected def copy = new dt( _: Attributes )( content )
}

object dt
{
	def apply( attributes: Attributes )( content: Html ): dt = new dt( attributes )( content )

	def apply( content: Html ): dt = apply( Attributes.empty )( content )
}