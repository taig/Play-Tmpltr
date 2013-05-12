package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class progress(attributes: Attributes)(content: Html) extends Tag.Html.Body.Progress[progress]( attributes )( content )
{
	protected def copy = new progress( _: Attributes )( content )
}

object progress
{
	def apply(value: Option[Float], maxvalue: Option[Float], attributes: (String, String)*)(content: Html): progress =
	{
		new progress( attributes ++ Attributes( "value" -> value, "maxvalue" -> maxvalue ) )( content )
	}

	def apply(maxvalue: Option[Float], attributes: (String, String)*)(content: Html): progress =
	{
		apply( None, maxvalue, attributes: _* )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): progress = apply( None, attributes: _* )( content )

	def apply(content: Html): progress = apply( )( content )
}