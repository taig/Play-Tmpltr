package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class cite(attributes: Attributes)(content: Html) extends Tag.Html.Body.Cite[cite]( attributes )( content )
{
	protected def copy = new cite( _: Attributes )( content )
}

object cite
{
	def apply(attributes: (String, String)*)(content: Html): cite = new cite( attributes )( content )

	def apply(content: Html): cite = apply( )( content )
}