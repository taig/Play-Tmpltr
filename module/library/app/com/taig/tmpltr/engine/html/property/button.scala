package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait button
{
	class `type`(`type`: String) extends Property( `type` )
	object `type`
	{
		object Button extends `type`( "button" )
		object Reset extends `type`( "reset" )
		object Submit extends `type`( "submit" )
	}
}