package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class optgroup(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Select.Options[optgroup]( attributes )( content )
{
	protected def copy = new optgroup( _: Attributes )( content )
}

object optgroup
{
	def apply(label: Option[String], attributes: (String, String)*)(content: Html): optgroup =
	{
		new optgroup( attributes ++ Attributes( "label" -> label ) )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): optgroup = apply( None, attributes: _* )( content )

	def apply(content: Html): optgroup = apply( )( content )
}