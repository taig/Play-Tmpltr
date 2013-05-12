package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class rp(attributes: Attributes)(content: Html) extends Tag.Html.Body.Ruby.Rp[rp]( attributes )( content )
{
	protected def copy = new rp( _: Attributes )( content )
}

object rp
{
	def apply(attributes: (String, String)*)(content: Html): rp = new rp( attributes )( content )

	def apply(content: Html): rp = apply( )( content )
}