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

	class Style( style: Option[String] ) extends Property( style )
	object Style
	{
		object Danger extends Style( "danger" )
		object Default extends Style( None )
		object Info extends Style( "info" )
		object Inverse extends Style( "inverse" )
		object Link extends Style( "link" )
		object Primary extends Style( "primary" )
		object Success extends Style( "success" )
		object Warning extends Style( "warning" )
	}
}