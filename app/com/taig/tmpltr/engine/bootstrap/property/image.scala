package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._

trait image
{
	class shape( shape: String ) extends Property( "img", shape )
	object shape
	{
		object circle extends shape( "circle" )
		object rounded extends shape( "rounded" )
		object thumbnail extends shape( "thumbnail" )
	}
}