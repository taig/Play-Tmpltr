package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class i(attributes: Attributes)(content: Html) extends Tag.Html.Body.Italic[i]( attributes )( content )
{
	protected def copy = new i( _: Attributes )( content )
}

object i
{
	def apply(attributes: (String, String)*)(content: Html): i = new i( attributes )( content )

	def apply(content: Html): i = apply( )( content )
}