package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class div(attributes: Attributes)(content: Html) extends Tag.Html.Body.Division[div]( attributes )( content )
{
	protected def copy = new div( _: Attributes )( content )
}

object div
{
	def apply(attributes: (String, String)*)(content: Html): div = new div( attributes )( content )

	def apply(content: Html): div = apply( )( content )
}