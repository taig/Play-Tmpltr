package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class figcaption(attributes: Attributes)(content: Html) extends Tag.Html.Body.Figure.Caption[figcaption]( attributes )( content )
{
	protected def copy = new figcaption( _: Attributes )( content )
}

object figcaption
{
	def apply(attributes: (String, String)*)(content: Html): figcaption = new figcaption( attributes )( content )

	def apply(content: Html): figcaption = apply( )( content )
}