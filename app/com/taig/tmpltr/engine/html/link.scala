package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	link( rel: Option[link.rel], href: Option[String], `type`: Option[String], attributes: Attributes )
extends	markup.link[link]( attributes ~~ ( ( "rel" -> rel, "href" -> href, "type" -> `type` ) ) )
{
	protected def copy = new link( rel, href, `type`, _: Attributes )
}

object link extends property.link
{
	def apply( rel: Option[rel] = None, href: Option[String] = None, `type`: Option[String] = None, attributes: Attributes = Attributes.empty ): link =
	{
		new link( rel, href, `type`, attributes )
	}

	def apply( attributes: Attributes ): link = apply( None, None, None, attributes )
	
	class	style( href: Option[String], attributes: Attributes )
	extends	link( rel.stylesheet, href, None, attributes )

	object style
	{
		def apply( href: Option[String] = None, attributes: Attributes = Attributes.empty ): style =
		{
			new style( href, attributes )
		}
	}
}