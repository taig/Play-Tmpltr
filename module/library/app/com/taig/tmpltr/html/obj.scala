package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class obj(attributes: Attributes)(content: Html) extends Tag.Html.Body.Object[obj]( attributes )( content )
{
	protected def copy = new obj( _: Attributes )( content )
}

object obj
{
	def apply(data: Option[String], attributes: (String, String)*)(content: Html): obj =
	{
		new obj( attributes ++ Attributes( "data" -> data ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): obj = apply( None, attributes: _* )( content )

	def apply(content: Html): obj = apply( )( content )
}