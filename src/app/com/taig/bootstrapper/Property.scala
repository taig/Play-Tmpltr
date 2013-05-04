package com.taig.bootstrapper

abstract class Property(val key: Option[String], val identifier: Option[String])
{
	override def toString = identifier.fold[String]( "" )( key.fold( "" )( _ + "-" ) + _ )
}