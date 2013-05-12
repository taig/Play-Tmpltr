package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class rt(attributes: Attributes)(content: Html) extends Tag.Html.Body.Ruby.Rt[rt]( attributes )( content )
{
	protected def copy = new rt( _: Attributes )( content )
}

object rt
{
	def apply(attributes: (String, String)*)(content: Html): rt = new rt( attributes )( content )

	def apply(content: Html): rt = apply( )( content )
}