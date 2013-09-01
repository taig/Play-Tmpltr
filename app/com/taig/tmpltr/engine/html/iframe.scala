package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	iframe( val attributes: Attributes, val content: Content )
extends	markup.iframe
with	Tag.Body[iframe, Content]
{
	def this( src: Option[String] = None, attributes: Attributes = Attributes.empty, content: Content ) =
	{
		this( attributes ~ ( "src" -> src ), content )
	}
}

object	iframe
extends	Tag.Body.Appliable[iframe, Content]
{
	def apply( src: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): iframe =
	{
		new iframe( src, attributes, content )
	}
}