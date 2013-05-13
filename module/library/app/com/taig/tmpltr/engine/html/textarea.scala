package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Txt

class	textarea( attributes: Attributes )( content: Txt )
extends	markup.textarea[textarea]( attributes )( content )
{
	def this( name: Option[String], attributes: Attributes )( content: Txt )
	{
		this( attributes ++ Attributes( "name" -> name ) )( content )
	}

	protected def copy = new textarea( _: Attributes )( content )
}

object textarea
{
	def apply( name: Option[String], value: Option[String], attributes: (String, String)* ): textarea =
	{
		new textarea( name, attributes )( value.fold( Txt.empty )( Txt( _ ) ) )
	}

	def apply( name: Option[String], attributes: (String, String)* ): textarea = apply( name, None, attributes: _* )

	def apply( attributes: (String, String)* ): textarea = apply( None, attributes: _* )
}