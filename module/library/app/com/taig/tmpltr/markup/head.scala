package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class head(attributes: Attributes)(content: Html) extends Tag.Html.Head[head]( attributes )( content )
{
	protected def copy = new head( _: Attributes )( content )
}

object head
{
	def apply(attributes: (String, String)*)(content: Html): head = new head( attributes )( content )

	def apply(content: Html): head = apply( )( content )
}