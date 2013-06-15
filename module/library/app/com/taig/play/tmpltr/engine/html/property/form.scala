package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait form
{
	class method(method: String) extends Property( method )
	object method
	{
		object get extends method( "GET" )
		object post extends method( "POST" )
	}
}