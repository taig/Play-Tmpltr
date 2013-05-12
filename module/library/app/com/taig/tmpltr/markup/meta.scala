package com.taig.tmpltr.markup

import com.taig.tmpltr.{Attributes, Tag}

class meta(attributes: Attributes) extends Tag.Html.Head.Meta[meta]( attributes )
{
	protected def copy = new meta( _: Attributes )
}

object meta
{
	def apply(name: Option[String], content: Option[String], attributes: (String, String)*): meta =
	{
		new meta( attributes ++ Attributes( "name" -> name, "content" -> content ) )
	}

	def apply(charset: Option[String], attributes: (String, String)*): meta =
	{
		new meta( attributes ++ Attributes( "charset" -> charset ) )
	}

	def apply(attributes: (String, String)*): meta = apply( None, attributes: _* )
}