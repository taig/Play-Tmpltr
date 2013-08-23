package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h( level: Int, attributes: Attributes )( content: Content )
extends markup.h[h]( level, attributes )( content )
{
	protected def copy = new h( level, _: Attributes )( content )
}

object h
{
	def apply( level: Int = 1, attributes: Attributes = Attributes.empty )( content: Content ): h =
	{
		new h( level, attributes )( content )
	}

	def apply( content: Content ): h = apply()( content )
}