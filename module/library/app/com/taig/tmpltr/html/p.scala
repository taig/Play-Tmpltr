package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class p(attributes: Attributes)( content: Html ) extends Tag.Html.Body.Paragraph[p]( attributes )( content )
{
	protected def copy = new p( _: Attributes )( content )
}

object p
{
	def apply( attributes: (String, String)* )( content: Html ): p = new p( attributes )( content )

	def apply( content: Html ): p = apply()( content )
}