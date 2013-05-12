package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class noscript(attributes: Attributes)(content: Html) extends Tag.Html.Script.Fallback[noscript]( attributes )( content )
{
	protected def copy = new noscript( _: Attributes )( content )
}

object noscript
{
	def apply(attributes: (String, String)*)(content: Html): noscript = new noscript( attributes )( content )

	def apply(content: Html): noscript = apply( )( content )
}