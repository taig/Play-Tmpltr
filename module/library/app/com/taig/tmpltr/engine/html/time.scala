package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	time( attributes: Attributes )( content: Html )
extends	markup.time[time]( attributes )( content )
{
	protected def copy = new time( _: Attributes )( content )
}

object time
{
	def apply( attributes: Attributes )( content: Html ): time = new time( attributes )( content )

	def apply( content: Html ): time = apply( Attributes.empty )( content )
}