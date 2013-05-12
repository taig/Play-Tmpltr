package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class kbd(attributes: Attributes)(content: Html) extends Tag.Html.Body.Keyboard[kbd]( attributes )( content )
{
	protected def copy = new kbd( _: Attributes )( content )
}

object kbd
{
	def apply(attributes: (String, String)*)(content: Html): kbd = new kbd( attributes )( content )

	def apply(content: Html): kbd = apply( )( content )
}