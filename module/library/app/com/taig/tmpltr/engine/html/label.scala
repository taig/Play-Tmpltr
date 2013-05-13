package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	label( attributes: Attributes )( content: Html )
extends	markup.label[label]( attributes )( content )
{
	def this( `for`: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "for" -> `for` ) )( content )
	}

	protected def copy = new label( _: Attributes )( content )
}

object label
{
	def apply( `for`: Option[String], attributes: (String, String)* )( content: Html ): label =
	{
		new label( `for`, attributes )( content )
	}

	def apply( attributes: (String, String)* )( content: Html ): label = apply( None, attributes: _* )( content )

	def apply( content: Html ): label = apply()( content )
}