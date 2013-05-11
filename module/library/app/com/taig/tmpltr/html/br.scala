package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}

class br(attributes: Attributes) extends Tag.Html.Body.Break[br]( attributes )
{
	protected def copy = new br( _: Attributes )
}

object br
{
	def apply(attributes: (String, String)*): br = new br( attributes )

	def apply: br = apply( )
}