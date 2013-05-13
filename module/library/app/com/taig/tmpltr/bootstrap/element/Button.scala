package com.taig.tmpltr.bootstrap.element

import com.taig.tmpltr
import com.taig.tmpltr._

trait Button
{
	class Property( identifier: Option[String] ) extends tmpltr.Property( ("btn" -> "-"), identifier )

	class Size( size: Option[String] ) extends Property( size )
	object Size
	{
		object Large extends Size( "large" )
		object Mini extends Size( "mini" )
		object Default extends Size( None )
		object Small extends Size( "small" )
	}

	class Type( `type`: Option[String] ) extends Property( `type` )
	object Type
	{
		object Danger extends Type( "danger" )
		object Default extends Type( None )
		object Info extends Type( "info" )
		object Inverse extends Type( "inverse" )
		object Link extends Type( "link" )
		object Primary extends Type( "primary" )
		object Success extends Type( "success" )
		object Warning extends Type( "warning" )
	}
}