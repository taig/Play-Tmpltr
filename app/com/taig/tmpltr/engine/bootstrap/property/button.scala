package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._

trait button
{
	class size( size: Option[String] ) extends Property( "btn" -> "-", size )
	object size
	{
		object large extends size( "large" )
		object mini extends size( "mini" )
		object default extends size( None )
		object small extends size( "small" )
	}

	class style( style: Option[String] ) extends Property( "btn" -> "-", style )
	object style
	{
		object danger extends style( "danger" )
		object default extends style( "default" )
		object info extends style( "info" )
		object inverse extends style( "inverse" )
		object link extends style( "link" )
		object primary extends style( "primary" )
		object success extends style( "success" )
		object warning extends style( "warning" )
	}
}