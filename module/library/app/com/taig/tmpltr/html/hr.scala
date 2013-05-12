package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}

class hr(attributes: Attributes) extends Tag.Html.Body.HorizontalRuler[hr]( attributes )
{
	protected def copy = new hr( _: Attributes )
}

object hr
{
	def apply(attributes: (String, String)*): hr = new hr( attributes )
}