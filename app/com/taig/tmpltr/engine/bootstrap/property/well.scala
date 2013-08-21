package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._

trait well
{
	class size( size: Option[String] ) extends Property( "well" -> "lg", size )
	object size
	{
		object default extends size( None )
		object large extends size( "lg" )
		object small extends size( "sm" )
	}
}