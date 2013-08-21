package engine.bootstrap.property

import com.taig.tmpltr._

trait callout
{
	class `type`( `type`: String ) extends Property( "bs-callout" -> "-", `type` )
	object `type`
	{
		object danger extends `type`( "danger" )
		object info extends `type`( "info" )
		object warning extends `type`( "warning" )
	}
}