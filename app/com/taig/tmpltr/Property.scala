package com.taig.tmpltr

abstract class Property( val prefix: Option[(String, String)], val identifier: String )
{
	def this( identifier: String ) = this( None, identifier )

	def this( prefix: (String, String), identifier: String ) = this( Some( prefix ), identifier )

	def this( prefix: String, identifier: String ) = this( Some( prefix -> "-" ), identifier )

	override def toString = prefix.map( t => t._1 + t._2 ).getOrElse( "" ) + identifier
}