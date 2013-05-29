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
	def apply( attributes: Attributes )( content: Html ): ol = new ol( attributes )( content )

	def apply( content: Html ): ol = apply( Attributes.empty )( content )

	def apply( list: Traversable[Any], attributes: Attributes = Attributes.empty ): ol =
	{
		apply( attributes )( Html( list.map( element => li( Html( element.toString ) ) ).mkString ) )
	}
}