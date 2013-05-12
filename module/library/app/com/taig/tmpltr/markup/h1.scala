package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class h1(attributes: Attributes)(content: Html) extends Tag.Html.Body.Headings.Heading[h1]( 1, attributes )( content )
{
	protected def copy = new h1( _: Attributes )( content )
}

object h1
{
	def apply(attributes: (String, String)*)(content: Html): h1 = new h1( attributes )( content )

	def apply(content: Html): h1 = apply( )( content )
}