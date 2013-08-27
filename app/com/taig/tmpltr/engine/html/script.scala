package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	script( val attributes: Attributes )( val content: Txt )
extends	markup.script
with	Tag.Body[script, Txt]
{
	def this( src: Option[String], attributes: Attributes ) =
	{
		this( attributes ~ ( "src" -> src ) )( Txt.empty )
	}
}

object	script
extends	Tag.Body.Appliable[script, Txt]
{
	def apply( src: Option[String] = None, attributes: Attributes = Attributes.empty ): script =
	{
		new script( src, attributes )
	}
}