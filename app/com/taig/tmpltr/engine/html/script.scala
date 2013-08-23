package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	script( attributes: Attributes )( content: Txt )
extends	markup.script[script]( attributes )( content )
{
	protected def copy = new script( _: Attributes )( content )
}

object script
{
	class	reference( src: Option[String], attributes: Attributes )
	extends	script( attributes ~ ( "src" -> src ) )( Txt.empty )

	object reference
	{
		def apply( src: Option[String] = None, attributes: Attributes = Attributes.empty ): reference =
		{
			new reference( src, attributes )
		}

		def apply( attributes: Attributes ): reference = apply( None, attributes )
	}

	class	definition( attributes: Attributes )( content: Txt )
	extends	script( attributes )( content )

	object definition
	{
		def apply( attributes: Attributes )( content: Txt ): definition =
		{
			new definition( attributes )( content )
		}

		def apply( content: Txt ): definition = apply( Attributes.empty )( content )
	}
}