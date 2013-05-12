package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class variable(attributes: Attributes)(content: Html) extends Tag.Html.Body.Variable[variable]( attributes )( content )
{
	protected def copy = new variable( _: Attributes )( content )
}

object variable
{
	def apply(attributes: (String, String)*)(content: Html): variable = new variable( attributes )( content )

	def apply(content: Html): variable = apply( )( content )
}