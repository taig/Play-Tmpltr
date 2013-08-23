package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	output( name: Option[String], `for`: Option[String], attributes: Attributes )( content: Content )
extends	markup.output[output]( attributes ~~ ( ( "name" -> name, "for" -> `for` ) ) )( content )
{
	protected def copy = new output( name, `for`, _: Attributes )( content )
}

object output
{
	def apply( name: Option[String] = None, `for`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): output =
	{
		new output( name, `for`, attributes )( content )
	}

	def apply( name: Option[String], attributes: Attributes )( content: Content ): output =
	{
		apply( name, None, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): output = apply( None, attributes )( content )

	def apply( content: Content ): output = apply( Attributes.empty )( content )
}