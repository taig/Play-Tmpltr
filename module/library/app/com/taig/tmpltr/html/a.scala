package com.taig.tmpltr.html

import com.taig.tmpltr.Tag.Html.Body.HyperLink
import com.taig.tmpltr.{Property, Attributes}
import play.api.templates.Html
import com.taig.tmpltr.html.a.Target

class a(href: Option[String], target: Option[Target], attributes: Attributes)(content: Html) extends HyperLink[a](
	attributes ++ Attributes( "href" -> href, "target" -> target )
)( content )
{
	def %(attributes: Attributes) = %( new a( href, target, _: Attributes )( content ), attributes )
}

object a
{
	implicit def targetToOption(target: Target): Option[Target] = Some( target )

	def apply(href: Option[String], target: Option[Target], attributes: (String, String)*)(content: Html): a =
	{
		new a( href, target, attributes )( content )
	}

	def apply(href: Option[String], attributes: (String, String)*)(content: Html): a =
	{
		new a( href, None, attributes )( content )
	}

	class Target(target: String) extends Property( "_" + target )
	object Target
	{
		object Blank extends Target( "blank" )
		object Self extends Target( "self" )
	}
}