package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class legend(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Legend[legend]( attributes )( content )
{
	protected def copy = new legend( _: Attributes )( content )
}

object legend
{
	def apply(attributes: (String, String)*)(content: Html): legend = new legend( attributes )( content )

	def apply(content: Html): legend = apply( )( content )
}