package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	button( `type`: Option[button.`type`], name: Option[String], attributes: Attributes )( content: Content )
extends markup.button[button]( attributes ~~ ( ( "type" -> `type`, "name" -> name ) ) )( content )
{
	protected def copy = new button( `type`, name, _: Attributes )( content )
}

object	button
extends	property.button
{
	def apply( `type`: Option[`type`] = None, name: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): button =
	{
		new button( `type`, name, attributes  )( content )
	}

	def apply( attributes: Attributes )( content: Content ): button = apply( None, None, attributes )( content )

	def apply( content: Content ): button = apply( Attributes.empty )( content )
}