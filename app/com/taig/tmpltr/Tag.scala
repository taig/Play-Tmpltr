package com.taig.tmpltr

import scala.xml._
import play.api.mvc.Content
import play.api.templates.Html

abstract class	Tag[T <: Tag[T]] protected( val tag: String, val content: Content, val attrs: Attributes, minimizeEmpty: Boolean = true )
extends 		Elem( null, tag, Null, TopScope, minimizeEmpty, Unparsed( content.body.trim ) )
with			Tag.Copy[T]
{
	def this( tag: String, attributes: Attributes, minimizeEmpty: Boolean = true ) =
	{
		this( tag, Html.empty, attributes, minimizeEmpty )
	}
	
	def this( element: Elem, attributes: Attributes = Attributes.empty ) =
	{
		this(
			element.label,
			Html( element.child.mkString ),
			attributes ~~ element.attributes.asAttrMap.mapValues( setFromAny ),
			element.minimizeEmpty
		)
	}

	override def toString =
	{
		"<" + label + ( if( attrs.nonEmpty ) " " + attrs.mkString( " " ) else "" ) + ( if( child.isEmpty && minimizeEmpty ) " />" else ">" +
			child.mkString +
		"</" + label + ">" )
	}
}

object Tag
{
	val empty = new Empty

	class Empty extends Tag[Empty]( null, Html.empty, Attributes.empty )
	{
		protected def copy = _ => empty

		override def toString = ""
	}
	
	trait Copy[T <: Tag[T]]
	{
		val attrs: Attributes

		def %( attributes: Attributes ): T = copy( attrs ~~ attributes )

		protected def copy: Attributes => T
	}
}