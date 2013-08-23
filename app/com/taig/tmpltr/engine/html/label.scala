package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	label( `for`: Option[String], attributes: Attributes )( content: Content )
extends	markup.label[label]( attributes ~ ( "for" -> `for` )  )( content )
{
	protected def copy = new label( `for`, _: Attributes )( content )
}

object label
{
	def apply( `for`: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): label =
	{
		new label( `for`, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): label = apply( None, attributes )( content )

	def apply( content: Content ): label = apply( Attributes.empty )( content )
}