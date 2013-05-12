package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class wbr(attributes: Attributes)(content: Html) extends Tag.Html.Body.WordBreak[wbr]( attributes )( content )
{
	protected def copy = new wbr( _: Attributes )( content )
}

object wbr
{
	def apply(attributes: (String, String)*)(content: Html): wbr = new wbr( attributes )( content )

	def apply(content: Html): wbr = apply( )( content )
}