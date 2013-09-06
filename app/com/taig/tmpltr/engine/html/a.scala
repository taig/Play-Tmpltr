package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	a( val attributes: Attributes, val content: Content )
extends	markup.a
with	Tag.Body[a, Content]
{
	def this( href: Option[String], target: Option[a.target], attributes: Attributes, content: Content ) =
	{
		this( attributes ~~ ( ( "href" -> href, "target" -> target ) ), content )
	}
}

object	a
extends	Tag.Body.Appliable[a, Content]
with	property.a
{
	def apply( href: String, target: Option[target] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new a( href, target, attributes, content )
	}
}