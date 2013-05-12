package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class tfoot(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table.Footer[tfoot]( attributes )( content )
{
	protected def copy = new tfoot( _: Attributes )( content )
}

object tfoot
{
	def apply(attributes: (String, String)*)(content: Html): tfoot = new tfoot( attributes )( content )

	def apply(content: Html): tfoot = apply( )( content )
}