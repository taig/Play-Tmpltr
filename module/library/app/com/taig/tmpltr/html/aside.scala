package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class aside(attributes: Attributes)(content: Html) extends Tag.Html.Body.Aside[aside]( attributes )( content )
{
	protected def copy = new aside( _: Attributes )( content )
}

object aside
{
	def apply(attributes: (String, String)*)(content: Html): aside = new aside( attributes )( content )

	def apply(content: Html): aside = apply( )( content )
}