package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	map( attributes: Attributes )( content: Html )
extends	markup.map[map]( attributes )( content )
{
	def this( name: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "name" -> name ) )( content )
	}

	protected def copy = new map( _: Attributes )( content )
}

object map
{
	def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): map =
	{
		new map( name, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): map = apply( None, attributes )( content )

	def apply( content: Html ): map = apply( Attributes.empty )( content )
}