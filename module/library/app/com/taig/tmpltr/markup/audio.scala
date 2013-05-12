package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}
import play.api.templates.Html

class audio(attributes: Attributes)(content: Html) extends Tag.Html.Body.Audio[audio]( attributes )( content )
{
	protected def copy = new audio( _: Attributes )( content )
}

object audio
{
	def apply(attributes: (String, String)*)(content: Html): audio = new audio( attributes )( content )

	def apply(content: Html): audio = apply( )( content )
}