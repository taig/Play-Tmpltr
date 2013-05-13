package com.taig.tmpltr.engine.html

import com.taig.tmpltr._
import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

class	link( attributes: Attributes )
extends	markup.link[link]( attributes )
{
	def this( rel: Option[link.rel], href: Option[String], `type`: Option[String], attributes: Attributes ) =
	{
		this( attributes ++ Attributes( "rel" -> rel, "href" -> href, "type" -> `type` ) )
	}

	protected def copy = new link( _: Attributes )
}

object link extends property.link
{
	def apply( rel: Option[rel], href: Option[String], `type`: Option[String], attributes: (String, String)* ): link =
	{
		new link( rel, href, `type`, attributes )
	}

	def apply( rel: Option[rel], href: Option[String], attributes: (String, String)* ): link =
	{
		apply( rel, href, None, attributes: _* )
	}

	def apply( attributes: (String, String)* ): link = apply( None, None, attributes: _* )

	object style
	{
		def apply( href: Option[String], attributes: (String, String)* ): link =
		{
			link( rel.stylesheet, href, attributes: _* )
		}
	}
}