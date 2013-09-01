package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	label( val attributes: Attributes, val content: Content )
extends	markup.label
with	Tag.Body[label, Content]
{
	def this( `for`: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "for" -> `for` ), content )
	}
}

object	label
extends	Tag.Body.Appliable[label, Content]
{
	def apply( `for`: Option[String] = None, attributes: Attributes )( content: Content ): label =
	{
		new label( `for`, attributes, content )
	}
}