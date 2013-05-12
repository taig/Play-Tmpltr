package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class dialog(attributes: Attributes)(content: Html) extends Tag.Html.Body.Dialog[dialog]( attributes )( content )
{
	protected def copy = new dialog( _: Attributes )( content )
}

object dialog
{
	def apply(attributes: (String, String)*)(content: Html): dialog = new dialog( attributes )( content )

	def apply(content: Html): dialog = apply( )( content )
}