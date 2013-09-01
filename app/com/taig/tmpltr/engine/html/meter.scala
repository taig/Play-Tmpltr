package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	meter( val attributes: Attributes, val content: Content )
extends	markup.meter
with	Tag.Body[meter, Content]
{
	def this( value: Option[Float], min: Option[Float], max: Option[Float], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "value" -> value, "min" -> min, "max" -> max ) ), content )
	}
}

object	meter
extends	Tag.Body.Appliable[meter, Content]
{
	def apply( value: Option[Float] = None, min: Option[Float] = None, max: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Content ): meter =
	{
		new meter( value, min, max, attributes, content )
	}
}