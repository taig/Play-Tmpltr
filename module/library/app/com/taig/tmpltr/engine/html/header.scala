package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	header( attributes: Attributes )( content: Html )
extends	markup.header[header]( attributes )( content )
{
	protected def copy = new header( _: Attributes )( content )
}

object header
{
	def apply( attributes: (String, String)* )( content: Html ): header = new header( attributes )( content )

	def apply( content: Html ): header = apply( )( content )
}