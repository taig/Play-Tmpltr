package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class embed(attributes: Attributes)(content: Html) extends Tag.Html.Body.Embed[embed]( attributes )( content )
{
	protected def copy = new embed( _: Attributes )( content )
}

object embed
{
	def apply(attributes: (String, String)*)(content: Html): embed = new embed( attributes )( content )

	def apply(content: Html): embed = apply( )( content )
}