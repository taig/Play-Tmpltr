package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class html(attributes: Attributes)(content: Html) extends Tag.Html[html]( attributes )( content )
{
	protected def copy = new html( _: Attributes )( content )
}

object html
{
	def apply(attributes: (String, String)*)(content: Html): html = new html( attributes )( content )

	def apply(content: Html): html = apply( )( content )
}