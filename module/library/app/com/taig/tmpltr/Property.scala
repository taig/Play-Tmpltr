package com.taig.tmpltr

abstract class Property(val prefix: Option[(String, String)], val identifier: String)
{
	def this(identifier: String) = this( None, identifier )

	override def toString = prefix.fold( "" ){ case (prefix, divider) => prefix + divider } + identifier
}