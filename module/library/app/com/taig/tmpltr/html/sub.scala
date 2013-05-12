package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class sub(attributes: Attributes)(content: Html) extends Tag.Html.Body.Subscript[sub]( attributes )( content )
{
	protected def copy = new sub( _: Attributes )( content )
}

object sub
{
	def apply(attributes: (String, String)*)(content: Html): sub = new sub( attributes )( content )

	def apply(content: Html): sub = apply( )( content )
}