package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	button( attributes: Attributes )( content: Html )
extends markup.button[button]( attributes )( content )
{
	def this( `type`: Option[button.`type`], name: Option[String], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "type" -> `type`, "name" -> name ) )( content )
	}

	protected def copy = new button( _: Attributes )( content )
}

object button extends property.button
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): button =
	{
		new button( `type`, name, attributes  )( content )
	}

	def apply( attributes: Attributes )( content: Html ): button = apply( None, None, attributes )( content )

	def apply( content: Html ): button = apply( Attributes.empty )( content )
}