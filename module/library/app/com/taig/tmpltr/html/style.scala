package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Txt

class style(attributes: Attributes)(content: Txt) extends Tag.Html.Head.Style[style]( attributes )( content )
{
	protected def copy = new style( _: Attributes )( content )
}

object style
{
	def apply(`type`: Option[String], attributes: (String, String)*)(content: Txt): style =
	{
		new style( attributes ++ Attributes( "type" -> `type` ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Txt): style = apply( None, attributes: _* )( content )

	def apply(content: Txt): style = apply( )( content )
}