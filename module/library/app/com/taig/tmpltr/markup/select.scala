package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class select(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Select[select]( attributes )( content )
{
	protected def copy = new select( _: Attributes )( content )
}

object select
{
	def apply(name: Option[String], attributes: (String, String)*)(content: Html): select =
	{
		new select( attributes ++ Attributes( "name" -> name ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): select = apply( None, attributes: _* )( content )

	def apply(content: Html): select = apply( )( content )
}