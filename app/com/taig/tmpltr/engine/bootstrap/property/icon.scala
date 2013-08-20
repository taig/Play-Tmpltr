package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._
import com.taig.tmpltr.Property

trait icon
{
	class image( image: String ) extends Property( "icon" -> "-", image )

	class color( color: Option[String] ) extends Property( "icon" -> "-", color )
	object color
	{
		object black extends color( None )
		object white extends color( "white" )
	}
}