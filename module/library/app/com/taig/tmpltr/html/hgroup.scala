package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class hgroup(attributes: Attributes)(content: Html) extends Tag.Html.Body.Headings[hgroup]( attributes )( content )
{
	protected def copy = new hgroup( _: Attributes )( content )
}

object hgroup
{
	def apply(attributes: (String, String)*)(content: Html): hgroup = new hgroup( attributes )( content )

	def apply(content: Html): hgroup = apply( )( content )
}