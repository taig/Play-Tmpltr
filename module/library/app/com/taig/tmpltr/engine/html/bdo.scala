package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	bdo( attributes: Attributes )( content: Html )
extends markup.bdo[bdo]( attributes )( content )
{
	protected def copy = new bdo( _: Attributes )( content )
}

object bdo
{
	def apply( attributes: (String, String)* )( content: Html ): bdo = new bdo( attributes )( content )
}