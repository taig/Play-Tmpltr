package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	optgroup( label: Option[String], attributes: Attributes )( content: Html )
extends	markup.optgroup[optgroup]( attributes ++ Attributes( "label" -> label ) )( content )
{
	protected def copy = new optgroup( label, _: Attributes )( content )
}

object optgroup
{
	def apply( label: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Html ): optgroup =
	{
		new optgroup( label, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): optgroup = apply( None, attributes )( content )

	def apply( content: Html ): optgroup = apply( Attributes.empty )( content )
}