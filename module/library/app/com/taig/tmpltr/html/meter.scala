package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class meter(attributes: Attributes)(content: Html) extends Tag.Html.Body.Meter[meter]( attributes )( content )
{
	protected def copy = new meter( _: Attributes )( content )
}

object meter
{
	def apply(value: Option[Float], min: Option[Float], max: Option[Float], attributes: (String, String)*)(content: Html): meter =
	{
		new meter( attributes ++ Attributes( "value" -> value, "min" -> min, "max" -> max ) )( content )
	}

	def apply(value: Option[Float], attributes: (String, String)*)(content: Html): meter =
	{
		apply( value, None, None, attributes: _* )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): meter = apply( None, attributes: _* )( content )

	def apply(content: Html): meter = apply( )( content )
}