package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	meta( val attributes: Attributes )
extends	markup.meta
with	Tag.Empty[meta]
{
	def this( name: String, content: String, attributes: Attributes ) =
	{
		this( attributes ~~ ( ( "name" -> name, "content" -> content ) ) )
	}

	def this( charset: String, attributes: Attributes ) =
	{
		this( attributes ~ ( "charset" -> charset ) )
	}
}

object	meta
extends	Tag.Empty.Appliable[meta]
{
	def apply( name: String, content: String, attributes: Attributes ): meta =
	{
		new meta( name, content, attributes )
	}

	def apply( name: String, content: String ): meta =
	{
		new meta( name, content, Attributes.empty )
	}

	def apply( charset: String, attributes: Attributes ): meta =
	{
		new meta( charset, attributes )
	}

	def apply( charset: String ): meta =
	{
		new meta( charset, Attributes.empty )
	}
}