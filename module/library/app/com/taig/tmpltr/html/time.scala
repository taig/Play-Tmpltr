package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class time(attributes: Attributes)(content: Html) extends Tag.Html.Body.Time[time]( attributes )( content )
{
	protected def copy = new time( _: Attributes )( content )
}

object time
{
	def apply(attributes: (String, String)*)(content: Html): time = new time( attributes )( content )

	def apply(content: Html): time = apply( )( content )
}