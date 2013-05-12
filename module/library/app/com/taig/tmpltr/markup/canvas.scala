package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class canvas(attributes: Attributes)(content: Html) extends Tag.Html.Body.Canvas[canvas]( attributes )( content )
{
	protected def copy = new canvas( _: Attributes )( content )
}

object canvas
{
	def apply(attributes: (String, String)*)(content: Html): canvas = new canvas( attributes )( content )
}