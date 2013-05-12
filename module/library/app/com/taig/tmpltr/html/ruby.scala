package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class ruby(attributes: Attributes)(content: Html) extends Tag.Html.Body.Ruby[ruby]( attributes )( content )
{
	protected def copy = new ruby( _: Attributes )( content )
}

object ruby
{
	def apply(attributes: (String, String)*)(content: Html): ruby = new ruby( attributes )( content )

	def apply(content: Html): ruby = apply( )( content )
}