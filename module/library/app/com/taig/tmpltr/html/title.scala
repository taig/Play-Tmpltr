package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Txt

class title(attributes: Attributes)(content: Txt) extends Tag.Html.Head.Title[title]( attributes )( content )
{
	protected def copy = new title( _: Attributes )( content )
}

object title
{
	def apply(attributes: (String, String)*)(content: Txt): title = new title( attributes )( content )

	def apply(content: Txt): title = apply( )( content )
}