package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	output( attributes: Attributes )( content: Html )
extends	markup.output[output]( attributes )( content )
{
	def this( name: Option[String], `for`: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "name" -> name, "for" -> `for` ) )( content )
	}

	protected def copy = new output( _: Attributes )( content )
}

object output
{
	def apply( name: Option[String] = None, `for`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): output =
	{
		new output( name, `for`, attributes )( content )
	}

	def apply( name: Option[String], attributes: Attributes )( content: Html ): output =
	{
		apply( name, None, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): output = apply( None, attributes )( content )

	def apply( content: Html ): output = apply( Attributes.empty )( content )
}