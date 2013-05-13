package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	select( attributes: Attributes )( content: Html )
extends	markup.select[select]( attributes )( content )
{
	def this( name: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "name" -> name ) )( content )
	}

	protected def copy = new select( _: Attributes )( content )
}

object select
{
	def apply( name: Option[String], attributes: (String, String)* )( content: Html ): select =
	{
		new select( name, attributes )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): select = apply( None, attributes: _* )( content )

	def apply( content: Html ): select = apply()( content )
}