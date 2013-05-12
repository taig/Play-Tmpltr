package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class ins(attributes: Attributes)(content: Html) extends Tag.Html.Body.Inserted[ins]( attributes )( content )
{
	protected def copy = new ins( _: Attributes )( content )
}

object ins
{
	def apply(attributes: (String, String)*)(content: Html): ins = new ins( attributes )( content )

	def apply(content: Html): ins = apply( )( content )
}