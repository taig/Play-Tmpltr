package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class area(attributes: Attributes)(content: Html) extends Tag.Html.Body.Map.Area[area]( attributes )( content )
{
	protected def copy = new area( _: Attributes )( content )
}

object area
{
	def apply(attributes: (String, String)*)(content: Html): area = new area( attributes )( content )

	def apply(content: Html): area = apply( )( content )
}