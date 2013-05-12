package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import com.taig.tmpltr.Tag.Html.Body.Form.Labelable
import play.api.templates.Html

class label(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Label[label]( attributes )( content )
{
	protected def copy = new label( _: Attributes )( content )

	def ->( input: Labelable ): label = throw new UnsupportedOperationException
}

object label
{
	def apply(`for`: Option[String], attributes: (String, String)*)(content: Html): label =
	{
		new label( attributes ++ Attributes( "for" -> `for` ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): label = apply( None, attributes: _* )( content )

	def apply(content: Html): label = apply( )( content )
}