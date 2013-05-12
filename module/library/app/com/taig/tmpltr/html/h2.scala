package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class h2(attributes: Attributes)(content: Html) extends Tag.Html.Body.Headings.Heading[h2]( 2, attributes )( content )
{
	protected def copy = new h2( _: Attributes )( content )
}

object h2
{
	def apply(attributes: (String, String)*)(content: Html): h2 = new h2( attributes )( content )

	def apply(content: Html): h2 = apply( )( content )
}