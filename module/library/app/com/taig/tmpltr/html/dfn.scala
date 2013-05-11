package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class dfn(attributes: Attributes)(content: Html) extends Tag.Html.Body.Definition[dfn]( attributes )( content )
{
	protected def copy = new dfn( _: Attributes )( content )
}

object dfn
{
	def apply(attributes: (String, String)*)(content: Html): dfn = new dfn( attributes )( content )

	def apply(content: Html): dfn = apply( )( content )
}