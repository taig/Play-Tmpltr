package com.taig.tmpltr

import scala.collection.MapLike

class	Attributes( collection: Map[String, Set[String]] )
extends	Map[String, Set[String]]
with	MapLike[String, Set[String], Attributes]
{
	override def empty = Attributes.empty

	def get( key: String ) = collection.get( key )

	def iterator: Iterator[(String, Set[String])] = collection.iterator

	def -(key: String): Attributes = new Attributes( collection - key )

	def +[B1 >: Set[String]](kv: (String, B1)): Map[String, B1] = collection + kv

	def ~( kv: (String, Set[String]) ) =
	{
		new Attributes( get( kv._1 ).fold( this + kv )( set => collection.updated( kv._1, set ++ kv._2 ) ) )
	}

	def ~~( attributes: Attributes ): Attributes = attributes.foldLeft[Attributes]( this )( _ ~ _ )

	override def mkString( start: String, separator: String, end: String ) =
	{
		new StringBuilder( start )
			.append( collect{ case (key, set) if set.nonEmpty => key + "=\""+ set.mkString( " " ) + "\"" }.mkString( separator ) )
			.append( end )
			.toString
	}

	override def toString = if( isEmpty ) "" else " " + mkString( " " )
}

object Attributes
{
	def empty = new Attributes( Map.empty )
}