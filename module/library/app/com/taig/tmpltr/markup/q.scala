package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class q(attributes: Attributes)(content: Html) extends Tag.Html.Body.Quote[q]( attributes )( content )
{
	protected def copy = new q( _: Attributes )( content )
}

object q
{
	def apply(attributes: (String, String)*)(content: Html): q = new q( attributes )( content )

	def apply(content: Html): q = apply( )( content )
}