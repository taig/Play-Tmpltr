package com.taig.tmpltr

import scala.collection.immutable.MapLike

class	Attributes( map: Map[String, String] )
extends	Map[String, String]
with	MapLike[String, String, Attributes]
{
	def get( key: String ) = map.get( key )

	def iterator: Iterator[(String, String)] = map.iterator

	def +[B1 >: String]( kv: (String, B1) ) = map.updated( kv._1, get( kv._1 ).fold( kv._2 )( _ + " " + kv._2 ) )

	def -( key: String ) = new Attributes( map - key )

	override def empty = Attributes.empty

	override def mkString: String = super.mkString

	override def mkString(start: String, sep: String, end: String): String =
	{
		val builder = new StringBuilder

		foldLeft( builder )( (builder, tuple) => builder
			.append( sep )
			.append( start )
			.append( tuple._1 )
			.append( "=\"" )
			.append( tuple._2 )
			.append( "\"" ).append( end )
		)

		builder.toString
	}

	override def toString: String = mkString( " " )
}

object Attributes
{
	def apply( attributes: (String, Option[_])* ): Attributes =
	{
		new Attributes( attributes.collect { case (key, Some( value )) => (key, value.toString) }.toMap )
	}

	def empty = new Attributes( Map.empty )
}