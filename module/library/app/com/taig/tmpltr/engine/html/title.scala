package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Txt

class	title( attributes: Attributes )( content: Txt )
extends	markup.title[title]( attributes )( content )
{
	protected def copy = new title( _: Attributes )( content )
}

object title
{
	def apply( attributes: (String, String)* )( content: Txt ): title = new title( attributes )( content )

	def apply( content: Txt ): title = apply()( content )
}