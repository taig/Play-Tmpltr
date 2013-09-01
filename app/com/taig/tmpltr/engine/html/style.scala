package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	style( val attributes: Attributes, val content: Txt )
extends	markup.style
with	Tag.Body[style, Txt]
{
	def this( `type`: Option[String], attributes: Attributes, content: Txt ) =
	{
		this( attributes ~ ( "type" -> `type` ), content )
	}
}

object	style
extends	Tag.Body.Appliable[style, Txt]
{
	def apply( `type`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Txt ): style =
	{
		new style( `type`, attributes, content )
	}
}