package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	obj( data: Option[String], attributes: Attributes )( content: Content )
extends	markup.obj[obj]( attributes ~ ( "data" -> data ) )( content )
{
	protected def copy = new obj( data, _: Attributes )( content )
}

object obj
{
	def apply( data: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): obj =
	{
		new obj( data, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): obj = apply( None, attributes )( content )

	def apply( content: Content ): obj = apply( Attributes.empty )( content )
}