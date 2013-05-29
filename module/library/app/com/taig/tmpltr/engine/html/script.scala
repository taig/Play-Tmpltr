package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Txt

class	script( attributes: Attributes )( content: Txt )
extends	markup.script[script]( attributes )( content )
{
	def this( src: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "src" -> src ) )( Txt.empty )
	}

	protected def copy = new script( _: Attributes )( content )
}

object script
{
	object reference
	{
		def apply( src: Option[String] = None, attributes: Attributes = Attributes.empty ): script =
		{
			new script( src, attributes )
		}

		def apply( attributes: Attributes ): script = apply( None, attributes )
	}

	object definition
	{
		def apply( attributes: Attributes )( content: Txt ): script =
		{
			new script( attributes )( content )
		}

		def apply( content: Txt ): script = apply( Attributes.empty )( content )
	}
}