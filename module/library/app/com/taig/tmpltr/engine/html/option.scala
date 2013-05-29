package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	option( attributes: Attributes )( content: Html )
extends	markup.option[option]( attributes )( content )
{
	def this( value: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "value" -> value ) )( content )
	}

	protected def copy = new option( _: Attributes )( content )
}

object option
{
	def apply( value: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): option =
	{
		new option( value, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): option = apply( None, attributes )( content )

	def apply( content: Html ): option = apply( Attributes.empty )( content )
}