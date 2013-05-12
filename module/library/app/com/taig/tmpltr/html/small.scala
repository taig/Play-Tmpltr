package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class small(attributes: Attributes)(content: Html) extends Tag.Html.Body.Small[small]( attributes )( content )
{
	protected def copy = new small( _: Attributes )( content )
}

object small
{
	def apply(attributes: (String, String)*)(content: Html): small = new small( attributes )( content )

	def apply(content: Html): small = apply( )( content )
}