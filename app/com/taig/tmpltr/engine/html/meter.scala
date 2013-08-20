package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	meter( value: Option[Float], min: Option[Float], max: Option[Float], attributes: Attributes )( content: Html )
extends	markup.meter[meter]( attributes ++ Attributes( "value" -> value, "min" -> min, "max" -> max ) )( content )
{
	protected def copy = new meter( value, min, max, _: Attributes )( content )
}

object meter
{
	def apply( value: Option[Float] = None, min: Option[Float] = None, max: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Html ): meter =
	{
		new meter( value, min, max, attributes )( content )
	}

	def apply( value: Option[Float], attributes: Attributes )( content: Html ): meter =
	{
		apply( value, None, None, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): meter = apply( None, attributes )( content )

	def apply( content: Html ): meter = apply( Attributes.empty )( content )
}