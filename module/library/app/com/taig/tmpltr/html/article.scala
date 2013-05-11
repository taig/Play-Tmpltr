package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class article(attributes: Attributes)(content: Html) extends Tag.Html.Body.Article[article]( attributes )( content )
{
	protected def copy = new article( _: Attributes )( content )
}

object article
{
	def apply(attributes: (String, String)*)(content: Html): article = new article( attributes )( content )

	def apply(content: Html): article = apply( )( content )
}