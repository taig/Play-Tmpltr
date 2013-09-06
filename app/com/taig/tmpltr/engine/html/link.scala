package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	link( val attributes: Attributes )
extends	markup.link
with	Tag.Empty[link]
{
	def this( rel: Option[link.rel], href: Option[String], `type`: Option[String], attributes: Attributes ) =
	{
		this( attributes ~~ ( ( "rel" -> rel, "href" -> href, "type" -> `type` ) ) )
	}
}

object	link
extends	Tag.Empty.Appliable[link]
with	property.link
{
	def apply( rel: Option[rel] = None, href: Option[String] = None, `type`: Option[String] = None, attributes: Attributes = Attributes.empty ): link =
	{
		new link( rel, href, `type`, attributes )
	}

	class	style( attributes: Attributes )
	extends	link( attributes ~ ( "rel" -> rel.stylesheet ) )
	with	Tag.Empty[style]
	{
		def this( href: Option[String], attributes: Attributes ) =
		{
			this( attributes ~ ( "href" -> href ) )
		}
	}

	object	style
	extends	Tag.Empty.Appliable[style]
	{
		def apply( href: Option[String] = None, attributes: Attributes = Attributes.empty ): style =
		{
			new style( href, attributes )
		}
	}
}