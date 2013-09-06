package com.taig.tmpltr.engine.html.property

import com.taig.tmpltr.Property

trait input
{
	class `type`( `type`: String ) extends Property( `type` )
	object `type`
	{
		object button extends `type`( "button" )
		object checkbox extends `type`( "checkbox" )
		object color extends `type`( "color" )
		object date extends `type`( "date" )
		object dateTime extends `type`( "datetime" )
		object dateTimeLocal extends `type`( "datetime-local" )
		object email extends `type`( "email" )
		object file extends `type`( "file" )
		object hidden extends `type`( "hidden" )
		object image extends `type`( "image" )
		object month extends `type`( "month" )
		object number extends `type`( "number" )
		object password extends `type`( "password" )
		object range extends `type`( "range" )
		object radio extends `type`( "radio" )
		object reset extends `type`( "reset" )
		object search extends `type`( "search" )
		object submit extends `type`( "submit" )
		object tel extends `type`( "tel" )
		object text extends `type`( "text" )
		object time extends `type`( "time" )
		object url extends `type`( "url" )
		object week extends `type`( "week" )
	}
}