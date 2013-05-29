package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	obj( attributes: Attributes )( content: Html )
extends	markup.obj[obj]( attributes )( content )
{
	def this( data: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "data" -> data ) )( content )
	}

	protected def copy = new obj( _: Attributes )( content )
}

object obj
{
	def apply( data: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): obj =
	{
		new obj( data, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): obj = apply( None, attributes )( content )

	def apply( content: Html ): obj = apply( Attributes.empty )( content )
}