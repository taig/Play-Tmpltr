package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Txt

class	style( attributes: Attributes )( content: Txt )
extends	markup.style[style]( attributes )( content )
{
	def this( `type`: Option[String], attributes: Attributes )( content: Txt ) =
	{
		this( attributes ++ Attributes( "type" -> `type` ) )( content )
	}

	protected def copy = new style( _: Attributes )( content )
}

object style
{
	def apply( `type`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Txt ): style =
	{
		new style( `type`, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Txt ): style = apply( None, attributes )( content )

	def apply( content: Txt ): style = apply( Attributes.empty )( content )
}