package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	map( val attributes: Attributes )( val content: Content )
extends	markup.map
with	Tag.Body[map, Content]
{
	def this( name: Option[String], attributes: Attributes )( content: Content ) =
	{
		this( attributes ~ ( "name" -> name ) )( content )
	}
}

object	map
extends	Tag.Body.Appliable[map, Content]
{
	def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): map =
	{
		new map( name, attributes )( content )
	}
}