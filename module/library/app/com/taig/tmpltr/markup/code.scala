package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class code(attributes: Attributes)(content: Html) extends Tag.Html.Body.Code[code]( attributes )( content )
{
	protected def copy = new code( _: Attributes )( content )
}

object code
{
	def apply(attributes: (String, String)*)(content: Html): code = new code( attributes )( content )

	def apply(content: Html): code = apply( )( content )
}