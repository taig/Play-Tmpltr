package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class section(attributes: Attributes)(content: Html) extends Tag.Html.Body.Section[section]( attributes )( content )
{
	protected def copy = new section( _: Attributes )( content )
}

object section
{
	def apply(attributes: (String, String)*)(content: Html): section = new section( attributes )( content )

	def apply(content: Html): section = apply( )( content )
}