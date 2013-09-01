package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	optgroup( val attributes: Attributes, val content: Content )
extends	markup.optgroup
with	Tag.Body[optgroup, Content]
{
	def this( label: Option[String], attributes: Attributes, content: Content ) =
	{
		this( attributes ~ ( "label" -> label ), content )
	}
}

object	optgroup
extends	Tag.Body.Appliable[optgroup, Content]
{
	def apply( label: Option[String] = None, attributes: Attributes = Attributes.empty )( content: Content ): optgroup =
	{
		new optgroup( label, attributes, content )
	}
}