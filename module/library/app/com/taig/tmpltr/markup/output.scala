package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class output(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Output[output]( attributes )( content )
{
	protected def copy = new output( _: Attributes )( content )
}

object output
{
	def apply(name: Option[String], `for`: Option[String], attributes: (String, String)*)(content: Html): output =
	{
		new output( attributes ++ Attributes( "name" -> name, "for" -> `for` ) )( content )
	}

	def apply(name: Option[String], attributes: (String, String)*)(content: Html): output =
	{
		apply( name, None, attributes: _* )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): output = apply( None, attributes: _* )( content )

	def apply(content: Html): output = apply( )( content )
}