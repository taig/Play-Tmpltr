package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class details(attributes: Attributes)(content: Html) extends Tag.Html.Body.Details[details]( attributes )( content )
{
	protected def copy = new details( _: Attributes )( content )
}

object details
{
	def apply(attributes: (String, String)*)(content: Html): details = new details( attributes )( content )

	def apply(content: Html): details = apply( )( content )
}