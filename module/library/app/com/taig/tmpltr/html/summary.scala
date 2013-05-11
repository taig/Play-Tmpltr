package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class summary(attributes: Attributes)(content: Html) extends Tag.Html.Body.Details.Summary[summary]( attributes )( content )
{
	protected def copy = new summary( _: Attributes )( content )
}

object summary
{
	def apply(attributes: (String, String)*)(content: Html): summary = new summary( attributes )( content )

	def apply(content: Html): summary = apply( )( content )
}