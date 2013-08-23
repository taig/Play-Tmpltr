package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	optgroup( label: Option[String], attributes: Attributes )( content: Content )
extends	markup.optgroup[optgroup]( attributes ~ ( "label" -> label ) )( content )
{
	protected def copy = new optgroup( label, _: Attributes )( content )
}

object optgroup
{
	def apply( label: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): optgroup =
	{
		new optgroup( label, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Content ): optgroup = apply( None, attributes )( content )

	def apply( content: Content ): optgroup = apply( Attributes.empty )( content )
}