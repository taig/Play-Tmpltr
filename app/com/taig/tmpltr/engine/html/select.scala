package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	select( val attributes: Attributes )( val content: Content )
extends	markup.select
with	Tag.Body[select, Content]
{
	def this( name: Option[String], attributes: Attributes )( content: Content ) =
	{
		this( attributes ~ ( "name" -> name ) )( content )
	}
}

object	select
extends	Tag.Body.Appliable[select, Content]
{
	def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): select =
	{
		new select( name, attributes )( content )
	}
}