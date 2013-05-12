package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class samp(attributes: Attributes)(content: Html) extends Tag.Html.Body.Sample[samp]( attributes )( content )
{
	protected def copy = new samp( _: Attributes )( content )
}

object samp
{
	def apply(attributes: (String, String)*)(content: Html): samp = new samp( attributes )( content )

	def apply(content: Html): samp = apply( )( content )
}