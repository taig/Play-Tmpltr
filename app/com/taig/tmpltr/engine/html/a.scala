package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	a( href: Option[String], target: Option[a.target], attributes: Attributes )( content: Content )
extends	markup.a[a]( attributes ~~ ( ( "href" -> href, "target" -> target ) ) )( content )
{
	protected def copy = new a( href, target, _: Attributes )( content )
}

object	a
extends	property.a
{
	def apply( href: Option[String] = None, target: Option[target] = None, attributes: Attributes = Attributes.empty )( content: Content ): a =
	{
		new a( href, target, attributes )( content )
	}

	def apply( content: Content ): a = apply()( content )
}