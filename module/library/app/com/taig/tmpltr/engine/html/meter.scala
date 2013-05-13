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
	def apply( value: Option[Float], min: Option[Float], max: Option[Float], attributes: (String, String)* )( content: Html ): meter =
	{
		new meter( value, min, max, attributes )( content )
	}

	def apply( value: Option[Float], attributes: (String, String)* )( content: Html ): meter =
	{
		apply( value, None, None, attributes: _* )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): meter = apply( None, attributes: _* )( content )

	def apply( content: Html ): meter = apply()( content )
}