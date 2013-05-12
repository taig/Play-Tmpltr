package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class mark(attributes: Attributes)(content: Html) extends Tag.Html.Body.Mark[mark]( attributes )( content )
{
	protected def copy = new mark( _: Attributes )( content )
}

object mark
{
	def apply(attributes: (String, String)*)(content: Html): mark = new mark( attributes )( content )

	def apply(content: Html): mark = apply( )( content )
}