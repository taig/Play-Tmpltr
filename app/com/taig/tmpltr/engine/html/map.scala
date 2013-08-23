package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	map( name: Option[String], attributes: Attributes )( content: Content )
extends	markup.map[map]( attributes ~ ( "name" -> name ) )( content )
{
	protected def copy = new map( name, _: Attributes )( content )
}

object map
{
	def apply( name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): map =
	{
		new map( name, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): map = apply( None, attributes )( content )

	def apply( content: Content ): map = apply( Attributes.empty )( content )
}