package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class strong(attributes: Attributes)(content: Html) extends Tag.Html.Body.Strong[strong]( attributes )( content )
{
	protected def copy = new strong( _: Attributes )( content )
}

object strong
{
	def apply(attributes: (String, String)*)(content: Html): strong = new strong( attributes )( content )

	def apply(content: Html): strong = apply( )( content )
}