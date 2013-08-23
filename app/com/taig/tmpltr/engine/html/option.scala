package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	option( value: Option[String], attributes: Attributes )( content: Content )
extends	markup.option[option]( attributes ~ ( "value" -> value ) )( content )
{
	protected def copy = new option( value, _: Attributes )( content )
}

object option
{
	def apply( value: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): option =
	{
		new option( value, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): option = apply( None, attributes )( content )

	def apply( content: Content ): option = apply( Attributes.empty )( content )
}