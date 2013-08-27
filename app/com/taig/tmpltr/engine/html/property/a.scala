package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait a
{
	class target( target: String ) extends Property( target )
	object target
	{
		object blank extends target( "_blank" )
		object parent extends target( "_parent" )
		object self extends target( "_self" )
		object top extends target( "_top" )
		class frame( name: String ) extends target( name )
	}
}