package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class h6(attributes: Attributes)(content: Html) extends Tag.Html.Body.Headings.Heading[h6]( 6, attributes )( content )
{
	protected def copy = new h6( _: Attributes )( content )
}

object h6
{
	def apply(attributes: (String, String)*)(content: Html): h6 = new h6( attributes )( content )

	def apply(content: Html): h6 = apply( )( content )
}