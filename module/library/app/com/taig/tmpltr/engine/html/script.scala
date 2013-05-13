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
		def apply( src: Option[String], attributes: (String, String)* ): script =
		{
			new script( src, attributes )
		}

		def apply( attributes: (String, String)* ): script = apply( None, attributes: _* )
	}

	object definition
	{
		def apply( attributes: (String, String)* )( content: Txt ): script =
		{
			new script( attributes )( content )
		}

		def apply( content: Txt ): script = apply()( content )
	}
}