package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	well( size: well.size, attributes: Attributes )( content: Content )
extends markup.div[well]( attributes ~ ( "class" -> size ) )( content )
{
	protected def copy = new well( size, _: Attributes )( content )
}

object	well
extends	property.well
{
	def apply( size: size = well.size.default, attributes: Attributes = Attributes.empty )( content: Content ) =
	{
		new well( size, attributes )( content )
	}
}