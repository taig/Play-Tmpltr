package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class map(attributes: Attributes)(content: Html) extends Tag.Html.Body.Map[map]( attributes )( content )
{
	protected def copy = new map( _: Attributes )( content )
}

object map
{
	def apply(name: Option[String], attributes: (String, String)*)(content: Html): map =
	{
		new map( attributes ++ Attributes( "name" -> name ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): map = apply( None, attributes: _* )( content )
}