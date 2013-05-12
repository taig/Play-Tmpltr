package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class header(attributes: Attributes)(content: Html) extends Tag.Html.Body.Header[header]( attributes )( content )
{
	protected def copy = new header( _: Attributes )( content )
}

object header
{
	def apply(attributes: (String, String)*)(content: Html): header = new header( attributes )( content )

	def apply(content: Html): header = apply( )( content )
}