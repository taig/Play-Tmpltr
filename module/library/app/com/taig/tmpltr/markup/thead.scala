package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class thead(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Head[thead]( attributes )( content )
{
	protected def copy = new thead( _: Attributes )( content )
}

object thead
{
	def apply(attributes: (String, String)*)(content: Html): thead = new thead( attributes )( content )

	def apply(content: Html): thead = apply( )( content )
}