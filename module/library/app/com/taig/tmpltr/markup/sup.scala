package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class sup(attributes: Attributes)(content: Html) extends Tag.Html.Body.Superscript[sup]( attributes )( content )
{
	protected def copy = new sup( _: Attributes )( content )
}

object sup
{
	def apply(attributes: (String, String)*)(content: Html): sup = new sup( attributes )( content )

	def apply(content: Html): sup = apply( )( content )
}