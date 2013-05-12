package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.{Txt, Html}

class textarea(attributes: Attributes)(content: Txt) extends Tag.Html.Body.Form.TextArea[textarea]( attributes )( content )
{
	protected def copy = new textarea( _: Attributes )( content )
}

object textarea
{
	def apply(name: Option[String], value: Option[String], attributes: (String, String)*): textarea =
	{
		new textarea( attributes ++ Attributes( "name" -> name ) )( value.fold( Txt.empty )( Txt( _ ) ) )
	}

	def apply(name: Option[String], attributes: (String, String)*): textarea = apply( name, None, attributes: _* )

	def apply(attributes: (String, String)*): textarea = apply( None, attributes: _* )
}