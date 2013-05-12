package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class dt(attributes: Attributes)(content: Html) extends Tag.Html.Body.Definitions.Term[dt]( attributes )( content )
{
	protected def copy = new dt( _: Attributes )( content )
}

object dt
{
	def apply(attributes: (String, String)*)(content: Html): dt = new dt( attributes )( content )

	def apply(content: Html): dt = apply( )( content )
}