package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class dl(attributes: Attributes)(content: Html) extends Tag.Html.Body.Definitions[dl]( attributes )( content )
{
	protected def copy = new dl( _: Attributes )( content )
}

object dl
{
	def apply(attributes: (String, String)*)(content: Html): dl = new dl( attributes )( content )

	def apply(content: Html): dl = apply( )( content )
}