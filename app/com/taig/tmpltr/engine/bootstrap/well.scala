package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.{ markup, Attributes }

import play.api.templates.Html

class	well( attributes: Attributes )( content: Html )
extends markup.div[well]( attributes )( content )
{
	def this( size: well.size, attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "class" -> size ) )( content )
	}

	protected def copy = new well( _: Attributes )( content )
}

object	well
extends	property.well
{
	def apply( size: size = well.size.default, attributes: Attributes = Attributes.empty )( content: Html ) : well =
	{
		new well( size, attributes )( content )
	}
}