package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class b(attributes: Attributes)(content: Html) extends Tag.Html.Body.Bold[b]( attributes )( content )
{
	protected def copy = new b( _: Attributes )( content )
}

object b
{
	def apply(attributes: (String, String)*)(content: Html): b = new b( attributes )( content )

	def apply(content: Html): b = apply( )( content )
}