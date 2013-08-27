package com.taig.tmpltr.engine.bootstrap.property

import com.taig.tmpltr._

trait panel
{
	class style( style: String ) extends Property( "panel", style )
	object style
	{
		object default extends style( "default" )
		object primary extends style( "primary" )
		object success extends style( "success" )
		object info extends style( "info" )
		object warning extends style( "warning" )
		object danger extends style( "danger" )
	}
}