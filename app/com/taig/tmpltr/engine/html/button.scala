package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	button( val attributes: Attributes, val content: Content )
extends	markup.button
with	Tag.Body[button, Content]
{
	def this( `type`: Option[button.`type`], name: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "type" -> `type`, "name" -> name ) ), content )
	}
}

object	button
extends	Tag.Body.Appliable[button, Content]
with	property.button
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new button( `type`, name, attributes, content )
	}
}