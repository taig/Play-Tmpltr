package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class figure(attributes: Attributes)(content: Html) extends Tag.Html.Body.Figure[figure]( attributes )( content )
{
	protected def copy = new figure( _: Attributes )( content )
}

object figure
{
	def apply(attributes: (String, String)*)(content: Html): figure = new figure( attributes )( content )

	def apply(content: Html): figure = apply( )( content )
}