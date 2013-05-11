package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class datalist(attributes: Attributes)(content: Html) extends Tag.Html.Body.Data[datalist]( attributes )( content )
{
	protected def copy = new datalist( _: Attributes )( content )
}

object datalist
{
	def apply(attributes: (String, String)*)(content: Html): datalist = new datalist( attributes )( content )

	def apply(content: Html): datalist = apply( )( content )
}