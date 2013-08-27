package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait button
{
	class `type`( `type`: String ) extends Property( `type` )
	object `type`
	{
		object button extends `type`( "button" )
		object reset extends `type`( "reset" )
		object submit extends `type`( "submit" )
	}
}