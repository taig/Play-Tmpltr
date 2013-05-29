package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	audio( attributes: Attributes )( content: Html )
extends	markup.audio[audio]( attributes )( content )
{
	protected def copy = new audio( _: Attributes )( content )
}

object audio
{
	def apply( attributes: Attributes )( content: Html ): audio = new audio( attributes )( content )

	def apply( content: Html ): audio = apply( Attributes.empty )( content )
}