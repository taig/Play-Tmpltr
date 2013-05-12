package com.taig.tmpltr.markup

import com.taig.tmpltr._

class link(attributes: Attributes) extends Tag.Html.Head.Link[link]( attributes )
{
	protected def copy = new link( _: Attributes )
}

object link
{
	def apply(rel: Option[Related], href: Option[String], `type`: Option[String], attributes: (String, String)*): link =
	{
		new link( attributes ++ Attributes( "rel" -> rel, "href" -> href, "type" -> `type` ) )
	}

	def apply(rel: Option[Related], href: Option[String], attributes: (String, String)*): link = apply( rel, href, None, attributes: _* )

	def apply(attributes: (String, String)*): link = apply( None, None, attributes: _* )

	class Related( related: String ) extends Property( related )
	object Related
	{
		object Alternate extends Related( "alternate" )
		object Archives extends Related( "archives" )
		object Author extends Related( "author" )
		object Bookmark extends Related( "bookmark" )
		object External extends Related( "external" )
		object First extends Related( "first" )
		object Help extends Related( "help" )
		object Icon extends Related( "icon" )
		object Last extends Related( "last" )
		object License extends Related( "license" )
		object Next extends Related( "next" )
		object NoFollow extends Related( "nofollow" )
		object NoReferrer extends Related( "noreferrer" )
		object Pingback extends Related( "pingback" )
		object Prefetch extends Related( "prefetch" )
		object Previous extends Related( "prev" )
		object Search extends Related( "search" )
		object Sidebar extends Related( "sidebar" )
		object Stylesheet extends Related( "stylesheet" )
		object Tag extends Related( "tag" )
		object Up extends Related( "up" )
	}

	object style
	{
		def apply(href: Option[String], attributes: (String, String)*): link =
		{
			link( Related.Stylesheet, href, "text/css", attributes: _* )
		}
	}
}