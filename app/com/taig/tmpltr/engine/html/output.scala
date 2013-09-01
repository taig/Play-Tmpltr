package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	output( val attributes: Attributes, val content: Content )
extends	markup.output
with	Tag.Body[output, Content]
{
	def this( name: Option[String], `for`: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "name" -> name, "for" -> `for` ) ), content )
	}
}

object	output
extends	Tag.Body.Appliable[output, Content]
{
	def apply( name: Option[String] = None, `for`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): output =
	{
		new output( name, `for`, attributes, content )
	}
}