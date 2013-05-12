package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class blockquote(attributes: Attributes)(content: Html) extends Tag.Html.Body.Blockquote[blockquote]( attributes )( content )
{
	protected def copy = new blockquote( _: Attributes )( content )
}

object blockquote
{
	def apply(attributes: (String, String)*)(content: Html): blockquote = new blockquote( attributes )( content )

	def apply(content: Html): blockquote = apply( )( content )
}