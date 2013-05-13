package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait a
{
	class target( target: String ) extends Property( "_" + target )
	object target
	{
		object blank extends target( "blank" )
		object parent extends target( "parent" )
		object self extends target( "self" )
		object top extends target( "top" )
	}
}