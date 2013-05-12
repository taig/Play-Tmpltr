package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class th(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Row.Head[th]( attributes )( content )
{
	protected def copy = new th( _: Attributes )( content )
}

object th
{
	def apply(attributes: (String, String)*)(content: Html): th = new th( attributes )( content )

	def apply(content: Html): th = apply( )( content )
}