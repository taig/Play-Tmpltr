package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}

class img(attributes: Attributes) extends Tag.Html.Body.Image[img]( attributes )
{
	protected def copy = new img( _: Attributes )
}

object img
{
	def apply(src: Option[String], alt: Option[String], attributes: (String, String)*): img =
	{
		new img( attributes ++ Attributes( "src" -> src, "alt" -> alt ) )
	}

	def apply(attributes: (String, String)*): img = apply( None, None, attributes: _* )
}