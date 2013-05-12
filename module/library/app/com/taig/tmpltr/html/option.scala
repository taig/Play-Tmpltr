package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class option(attributes: Attributes)(content: Html) extends Tag.Html.Body.Selection.Option[option]( attributes )( content )
{
	protected def copy = new option( _: Attributes )( content )
}

object option
{
	def apply(value: Option[String], attributes: (String, String)*)(content: Html): option =
	{
		new option( attributes ++ Attributes( "value" -> value ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): option = new option( attributes )( content )

	def apply(content: Html): option = apply( )( content )
}