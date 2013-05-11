package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class dd(attributes: Attributes)(content: Html) extends Tag.Html.Body.Definitions.Definition[dd]( attributes )( content )
{
	protected def copy = new dd( _: Attributes )( content )
}

object dd
{
	def apply(attributes: (String, String)*)(content: Html): dd = new dd( attributes )( content )

	def apply(content: Html): dd = apply( )( content )
}