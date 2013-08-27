package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._

trait well
{
	class size( size: String ) extends Property( "well", size )
	object size
	{
		object large extends size( "lg" )
		object small extends size( "sm" )
	}
}