package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Txt

class script(attributes: Attributes)(content: Txt) extends Tag.Html.Script[script]( attributes )( content )
{
	protected def copy = new script( _: Attributes )( content )
}

object script
{
	def apply(src: Option[String], attributes: (String, String)*): script =
	{
		new script( attributes ++ Attributes( "src" -> src ) )( Txt.empty )
	}

	def apply(attributes: (String, String)*)(content: Txt): script =
	{
		new script( attributes )( content )
	}

	def apply(content: Txt): script = apply( )( content )
}