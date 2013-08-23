package com.taig.tmpltr

abstract class Property( val prefix: Option[(String, String)], val identifier: Option[String] )
{
	def this( identifier: String ) = this( None, Some( identifier ) )

	def this( prefix: (String, String), identifier: Option[String] ) = this( Some( prefix ), identifier )

	override def toString =
	{
		identifier.map( prefix.map( t => t._1 + t._2 ).getOrElse( "" ) + _ ).getOrElse( "" )
	}
}