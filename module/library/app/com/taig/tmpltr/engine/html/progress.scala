package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	progress( attributes: Attributes )( content: Html )
extends	markup.progress[progress]( attributes )( content )
{
	def this( value: Option[Float], maxvalue: Option[Float], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "value" -> value, "maxvalue" -> maxvalue ) )( content )
	}

	protected def copy = new progress( _: Attributes )( content )
}

object progress
{
	def apply( value: Option[Float] = None, maxvalue: Option[Float] = None, attributes: Attributes = Attributes.empty )( content: Html ): progress =
	{
		new progress( value, maxvalue, attributes )( content )
	}

	def apply( maxvalue: Option[Float], attributes: Attributes )( content: Html ): progress =
	{
		apply( None, maxvalue, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): progress = apply( None, attributes )( content )

	def apply( content: Html ): progress = apply( Attributes.empty )( content )
}