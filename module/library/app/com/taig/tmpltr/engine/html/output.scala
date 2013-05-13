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
	def apply( name: Option[String], `for`: Option[String], attributes: (String, String)* )( content: Html ): output =
	{
		new output( name, `for`, attributes )( content )
	}

	def apply( name: Option[String], attributes: (String, String)* )( content: Html ): output =
	{
		apply( name, None, attributes: _* )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): output = apply( None, attributes: _* )( content )

	def apply( content: Html ): output = apply()( content )
}