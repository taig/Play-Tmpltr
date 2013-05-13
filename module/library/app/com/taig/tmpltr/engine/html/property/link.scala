package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait link
{
	class rel( rel: String ) extends Property( rel )
	object rel
	{
		object alternate extends rel( "alternate" )
		object archives extends rel( "archives" )
		object author extends rel( "author" )
		object bookmark extends rel( "bookmark" )
		object external extends rel( "external" )
		object first extends rel( "first" )
		object help extends rel( "help" )
		object icon extends rel( "icon" )
		object last extends rel( "last" )
		object license extends rel( "license" )
		object next extends rel( "next" )
		object no_follow extends rel( "nofollow" )
		object no_referrer extends rel( "noreferrer" )
		object pingback extends rel( "pingback" )
		object prefetch extends rel( "prefetch" )
		object previous extends rel( "prev" )
		object search extends rel( "search" )
		object sidebar extends rel( "sidebar" )
		object stylesheet extends rel( "stylesheet" )
		object tag extends rel( "tag" )
		object up extends rel( "up" )
	}
}
