package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class li(attributes: Attributes)(content: Html) extends Tag.Html.Body.List.Item[li]( attributes )( content )
{
	protected def copy = new li( _: Attributes )( content )
}

object li
{
	def apply(attributes: (String, String)*)(content: Html): li = new li( attributes )( content )

	def apply(content: Html): li = apply( )( content )
}