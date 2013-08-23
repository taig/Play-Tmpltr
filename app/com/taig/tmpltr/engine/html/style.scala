package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	style( `type`: Option[String], attributes: Attributes )( content: Txt )
extends	markup.style[style]( attributes ~ ( "type" -> `type` ) )( content )
{
	protected def copy = new style( `type`, _: Attributes )( content )
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