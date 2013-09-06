package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h( val level: Int, val attributes: Attributes, val content: Content )
extends	markup.h
with	Tag.Body[h, Content]
{
	require( level >= 1 && level <= 6 )
}

object	h
{
	def apply( level: Int, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new h( level, attributes, content )
	}
}