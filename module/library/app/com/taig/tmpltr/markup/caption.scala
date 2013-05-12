package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class caption(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Caption[caption]( attributes )( content )
{
	protected def copy = new caption( _: Attributes )( content )
}

object caption
{
	def apply(attributes: (String, String)*)(content: Html): caption = new caption( attributes )( content )

	def apply(content: Html): caption = apply( )( content )
}