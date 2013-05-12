package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class iframe(attributes: Attributes)(content: Html) extends Tag.Html.Body.InlineFrame[iframe]( attributes )( content )
{
	protected def copy = new iframe( _: Attributes )( content )
}

object iframe
{
	def apply(src: Option[String], attributes: (String, String)*)(content: Html): iframe =
	{
		new iframe( attributes ++ Attributes( "src" -> src ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): iframe = apply( None, attributes: _* )( content )

	def apply(content: Html): iframe = apply( )( content )
}