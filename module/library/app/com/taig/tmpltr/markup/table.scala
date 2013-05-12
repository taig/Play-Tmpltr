package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class table(attributes: Attributes)(content: Html) extends Tag.Html.Body.Table[table]( attributes )( content )
{
	protected def copy = new table( _: Attributes )( content )
}

object table
{
	def apply(attributes: (String, String)*)(content: Html): table = new table( attributes )( content )

	def apply(content: Html): table = apply( )( content )
}