package com.taig.tmpltr

abstract class Property(val prefix: Option[(String, String)], val identifier: Option[String])
{
	def this(identifier: String) = this( None, identifier )

	override def toString =
	{
		identifier.fold( "" )( prefix.fold( "" ){ case (prefix, divider) => prefix + divider } + _ )
	}
}