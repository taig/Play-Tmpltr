package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	progress( value: Option[Float], maxvalue: Option[Float], attributes: Attributes )( content: Content )
extends	markup.progress[progress]( attributes ~~ ( ( "value" -> value, "maxvalue" -> maxvalue ) ) )( content )
{
	protected def copy = new progress( value, maxvalue, _: Attributes )( content )
}

object progress
{
	def apply( value: Option[Float] = None, maxvalue: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Content ): progress =
	{
		new progress( value, maxvalue, attributes )( content )
	}

	def apply( maxvalue: Option[Float], attributes: Attributes )( content: Content ): progress =
	{
		apply( None, maxvalue, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): progress = apply( None, attributes )( content )

	def apply( content: Content ): progress = apply( Attributes.empty )( content )
}