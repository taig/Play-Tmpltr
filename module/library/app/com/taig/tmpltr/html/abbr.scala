package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class abbr(attributes: Attributes)(content: Html) extends Tag.Html.Body.Abbreviation[abbr]( attributes )( content )
{
	protected def copy = new abbr( _: Attributes )( content )
}

object abbr
{
	def apply(attributes: (String, String)*)(content: Html): abbr = new abbr( attributes )( content )

	def apply(content: Html): abbr = apply( )( content )
}