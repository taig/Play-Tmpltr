package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class u(attributes: Attributes)(content: Html) extends Tag.Html.Body.Underlined[u]( attributes )( content )
{
	protected def copy = new u( _: Attributes )( content )
}

object u
{
	def apply(attributes: (String, String)*)(content: Html): u = new u( attributes )( content )

	def apply(content: Html): u = apply( )( content )
}