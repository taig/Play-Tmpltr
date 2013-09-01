package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	textarea( val attributes: Attributes, val content: Txt )
extends	markup.textarea
with	Tag.Body[textarea, Txt]
{
	def this( name: Option[String], attributes: Attributes, content: Txt ) =
	{
		this( attributes ~ ( "name" -> name ), content )
	}
}

object	textarea
extends	Tag.Body.Appliable[textarea, Txt]
{
	def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Txt ) =
	{
		new textarea( name, attributes, content )
	}
}