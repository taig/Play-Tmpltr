package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	a( attributes: Attributes )( content: Html )
extends	markup.a[a]( attributes )( content )
{
	def this( href: Option[String], target: Option[a.target], attributes: Attributes )( content: Html ) =
	{
		this( attributes ++ Attributes( "href" -> href, "target" -> target ) )( content )
	}

	protected def copy = new a( _: Attributes )( content )
}

object a extends property.a
{
	def apply( href: Option[String] = None, target: Option[target] = None, attributes: Attributes = Attributes.empty )( content: Html ): a =
	{
		new a( href, target, attributes )( content )
	}

	def apply( attributes: Attributes ): a = apply( attributes = attributes )
}