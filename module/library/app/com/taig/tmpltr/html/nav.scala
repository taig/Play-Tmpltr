package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class nav(attributes: Attributes)(content: Html) extends Tag.Html.Body.Nav[nav]( attributes )( content )
{
	protected def copy = new nav( _: Attributes )( content )
}

object nav
{
	def apply(attributes: (String, String)*)(content: Html): nav = new nav( attributes )( content )

	def apply(content: Html): nav = apply( )( content )
}