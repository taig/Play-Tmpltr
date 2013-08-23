package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	meter( value: Option[Float], min: Option[Float], max: Option[Float], attributes: Attributes )( content: Content )
extends	markup.meter[meter]( attributes ~~ ( ( "value" -> value, "min" -> min, "max" -> max ) ) )( content )
{
	protected def copy = new meter( value, min, max, _: Attributes )( content )
}

object meter
{
	def apply( value: Option[Float] = None, min: Option[Float] = None, max: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Content ): meter =
	{
		new meter( value, min, max, attributes )( content )
	}

	def apply( value: Option[Float], attributes: Attributes )( content: Content ): meter =
	{
		apply( value, None, None, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): meter = apply( None, attributes )( content )

	def apply( content: Content ): meter = apply( Attributes.empty )( content )
}