package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class address(attributes: Attributes)(content: Html) extends Tag.Html.Body.Address[address]( attributes )( content )
{
	protected def copy = new address( _: Attributes )( content )
}

object address
{
	def apply(attributes: (String, String)*)(content: Html): address = new address( attributes )( content )

	def apply(content: Html): address = apply( )( content )
}