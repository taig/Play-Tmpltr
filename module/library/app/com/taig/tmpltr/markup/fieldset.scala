package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class fieldset(attributes: Attributes)(content: Html) extends Tag.Html.Body.Form.Fieldset[fieldset]( attributes )( content )
{
	protected def copy = new fieldset( _: Attributes )( content )
}

object fieldset
{
	def apply(attributes: (String, String)*)(content: Html): fieldset = new fieldset( attributes )( content )

	def apply(content: Html): fieldset = apply( )( content )
}