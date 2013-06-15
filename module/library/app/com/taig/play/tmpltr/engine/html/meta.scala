package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	meta( attributes: Attributes )
extends	markup.meta[meta]( attributes )
{
	def this( name: Option[String], content: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "name" -> name, "content" -> content ) )
	}

	def this( charset: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "charset" -> charset ) )
	}

	protected def copy = new meta( _: Attributes )
}

object meta
{
	def apply( name: Option[String] = None, content: Option[String] = None, attributes: Attributes = Attributes.empty ): meta =
	{
		new meta( name, content, attributes )
	}

	def apply( charset: Option[String], attributes: Attributes ): meta =
	{
		new meta( charset, attributes )
	}

	def apply( charset: Option[String] ): meta =
	{
		apply( charset, Attributes.empty )
	}

	def apply( attributes: Attributes ): meta = new meta( attributes )
}