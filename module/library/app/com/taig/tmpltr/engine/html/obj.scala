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
	def apply( data: Option[String], attributes: (String, String)* )( content: Html ): obj =
	{
		new obj( data, attributes )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): obj = apply( None, attributes: _* )( content )

	def apply( content: Html ): obj = apply()( content )
}