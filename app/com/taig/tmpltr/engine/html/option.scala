package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	option( val attributes: Attributes, val content: Content )
extends	markup.option
with	Tag.Body[option, Content]
{
	def this( value: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "value" -> value ), content )
	}
}

object	option
extends	Tag.Body.Appliable[option, Content]
{
	def apply( value: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): option =
	{
		new option( value, attributes, content )
	}
}