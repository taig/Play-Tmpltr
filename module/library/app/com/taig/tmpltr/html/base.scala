package com.taig.tmpltr.html

import com.taig.tmpltr.{Attributes, Tag}
import com.taig.tmpltr.html.a.Target

class base(attributes: Attributes) extends Tag.Html.Head.Base[base]( attributes )
{
	protected def copy = new base( _: Attributes )
}

object base
{
	def apply(href: Option[String], target: Option[Target], attributes: (String, String)*): base =
	{
		new base( attributes ++ Attributes( "href" -> href, "target" -> target ) )
	}

	def apply(href: Option[String], attributes: (String, String)*): base = apply( href, None, attributes: _* )

	def apply(attributes: (String, String)*): base = apply( None, attributes: _* )
}