package com.taig.tmpltr.html

import com.taig.tmpltr.Tag
import com.taig.tmpltr.{Property, Attributes}
import play.api.templates.Html
import com.taig.tmpltr.html.a.Target

class a(href: Option[String], target: Option[Target], attributes: Attributes)(content: Html) extends Tag.Html.Body.HyperLink[a](
	attributes ++ Attributes( "href" -> href, "target" -> target )
)( content )
{
	protected def copy = new a( href, target, _: Attributes )( content )
}

object a
{
	def apply(href: Option[String], target: Option[Target], attributes: (String, String)*)(content: Html): a =
	{
		new a( href, target, attributes )( content )
	}

	def apply(href: Option[String], attributes: (String, String)*)(content: Html): a =
	{
		apply( href, None, attributes: _* )( content )
	}

	class Target(target: String) extends Property( "_" + target )
	object Target
	{
		object Blank extends Target( "blank" )
		object Parent extends Target( "parent" )
		object Self extends Target( "self" )
		object Top extends Target( "top" )
	}
}