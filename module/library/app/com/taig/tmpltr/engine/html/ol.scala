package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	ol( attributes: Attributes )( content: Html )
extends	markup.ol[ol]( attributes )( content )
{
	protected def copy = new ol( _: Attributes )( content )
}

object ol
{
	def apply( attributes: (String, String)* )( content: Html ): ol = new ol( attributes )( content )

	def apply( content: Html ): ol = apply()( content )
}