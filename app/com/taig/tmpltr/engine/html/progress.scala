package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	progress( val attributes: Attributes, val content: Content )
extends	markup.progress
with	Tag.Body[progress, Content]
{
	def this( value: Option[Float], maxvalue: Option[Float], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "value" -> value, "maxvalue" -> maxvalue ) ), content )
	}
}

object	progress
extends	Tag.Body.Appliable[progress, Content]
{
	def apply( value: Option[Float] = None, maxvalue: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new progress( value, maxvalue, attributes, content )
	}
}