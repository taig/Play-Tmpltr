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
	def apply( `type`: Option[String], attributes: (String, String)* )( content: Txt ): style =
	{
		new style( `type`, attributes )( content )
	}

	def apply( attributes: (String, String)* )( content: Txt ): style = apply( None, attributes: _* )( content )

	def apply( content: Txt ): style = apply()( content )
}