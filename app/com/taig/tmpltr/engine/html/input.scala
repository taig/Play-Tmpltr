package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	input( val attributes: Attributes )
extends	markup.input
with	Tag.Empty[input]
{
	def this( `type`: Option[input.`type`], name: Option[String], value: Option[String], attributes: Attributes ) =
	{
		this( attributes ~~ ( ( "type" -> `type`, "name" -> name, "value" -> value ) ) )
	}
}

object	input
extends	Tag.Empty.Appliable[input]
with	property.input
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, value: Option[String] = None, attributes: Attributes = Attributes.empty ) =
	{
		new input( `type`, name, value, attributes )
	}
}