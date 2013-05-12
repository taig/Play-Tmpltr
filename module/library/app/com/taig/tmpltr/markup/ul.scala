package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class ul(attributes: Attributes)(content: Html) extends Tag.Html.Body.UnorderedList[ul]( attributes )( content )
{
	protected def copy = new ul( _: Attributes )( content )
}

object ul
{
	def apply(attributes: (String, String)*)(content: Html): ul = new ul( attributes )( content )

	def apply(content: Html): ul = apply( )( content )
}