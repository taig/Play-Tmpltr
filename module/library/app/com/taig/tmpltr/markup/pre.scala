package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class pre(attributes: Attributes)(content: Html) extends Tag.Html.Body.FormattedText[pre]( attributes )( content )
{
	protected def copy = new pre( _: Attributes )( content )
}

object pre
{
	def apply(attributes: (String, String)*)(content: Html): pre = new pre( attributes )( content )

	def apply(content: Html): pre = apply( )( content )
}