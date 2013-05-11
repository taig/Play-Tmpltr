package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class em(attributes: Attributes)(content: Html) extends Tag.Html.Body.Emphasis[em]( attributes )( content )
{
	protected def copy = new em( _: Attributes )( content )
}

object em
{
	def apply(attributes: (String, String)*)(content: Html): em = new em( attributes )( content )

	def apply(content: Html): em = apply( )( content )
}