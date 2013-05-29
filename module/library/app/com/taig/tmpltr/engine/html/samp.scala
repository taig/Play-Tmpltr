package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	samp( attributes: Attributes )( content: Html )
extends	markup.samp[samp]( attributes )( content )
{
	protected def copy = new samp( _: Attributes )( content )
}

object samp
{
	def apply( attributes: Attributes )( content: Html ): samp = new samp( attributes )( content )

	def apply( content: Html ): samp = apply( Attributes.empty )( content )
}