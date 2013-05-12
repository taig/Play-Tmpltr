package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class del(attributes: Attributes)(content: Html) extends Tag.Html.Body.Deleted[del]( attributes )( content )
{
	protected def copy = new del( _: Attributes )( content )
}

object del
{
	def apply(attributes: (String, String)*)(content: Html): del = new del( attributes )( content )

	def apply(content: Html): del = apply( )( content )
}