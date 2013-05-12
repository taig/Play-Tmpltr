package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class tr(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Row[tr]( attributes )( content )
{
	protected def copy = new tr( _: Attributes )( content )
}

object tr
{
	def apply(attributes: (String, String)*)(content: Html): tr = new tr( attributes )( content )

	def apply(content: Html): tr = apply( )( content )
}