package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class tbody(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Body[tbody]( attributes )( content )
{
	protected def copy = new tbody( _: Attributes )( content )
}

object tbody
{
	def apply(attributes: (String, String)*)(content: Html): tbody = new tbody( attributes )( content )

	def apply(content: Html): tbody = apply( )( content )
}