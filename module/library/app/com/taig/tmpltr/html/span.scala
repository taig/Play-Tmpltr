package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class span( attributes: Attributes )( content: Html ) extends Tag.Html.Body.Span[span]( attributes )( content )
{
	protected def copy = new span( _: Attributes )( content )
}

object span
{
	def apply( attributes: (String, String)* )( content: Html ): span = new span( attributes )( content )

	def apply( content: Html ): span = apply()( content )
}