package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	obj( val attributes: Attributes, val content: Content )
extends	markup.obj
with	Tag.Body[obj, Content]
{
	def this( data: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "data" -> data ), content )
	}
}

object	obj
extends	Tag.Body.Appliable[obj, Content]
{
	def apply( data: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new obj( data, attributes, content )
	}
}