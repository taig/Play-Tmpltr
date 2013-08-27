//package com.taig.tmpltr
//
//import play.api.mvc.Content
//import scala.reflect.runtime.universe._
//
//trait Tag
//{
//	protected lazy val helper: Tag.Copyable =
//	{
//		Tag.mirror
//			.reflectModule( Tag.mirror.staticModule( getClass.getName + "$" ) )
//			.instance
//			.asInstanceOf[Tag.Copyable]
//	}
//}
//
//object Tag
//{
//	protected lazy val mirror = runtimeMirror( getClass.getClassLoader )
//
//	trait Copyable
//	{
//		type T <: Tag
//
//		def getTypeTag[T: TypeTag]( t: T ) = typeTag[T]
//
//		private lazy val `class` = mirror.staticClass( getClass.getName.takeWhile( _ != '$' ) )
//
//		protected def reflect( arguments: AnyRef* ): T =
//		{
//			val constructor = Reflection.findConstructor[T]( arguments: _* )
//				.getOrElse( throw new RuntimeException( "No valid constructor given" ) )
//			
//			mirror
//				.reflectClass( `class` )
//				.reflectConstructor( constructor )
//				.apply( arguments: _* )
//				.asInstanceOf[T]
//		}
//
//		def copy( tag: T, attributes: Attributes ): T
//	}
//
//	trait Empty extends Tag
//	{
//		val tag: String
//
//		val attributes: Attributes
//
//		val minimized = true
//
//		def %( attributes: Attributes ) = helper.copy( this.asInstanceOf[helper.T], attributes )
//
//		override def toString = "<" + tag + attributes + ( if( minimized ) " />" else "></" + tag + ">" )
//	}
//
//	object Empty
//	{
//		trait Copyable extends Tag.Copyable
//		{
//			type T <: Tag.Empty
//
//			def copy( tag: T, attributes: Attributes ) = reflect( tag.attributes ~~ attributes )
//		}
//
//		trait Appliable extends Copyable
//		{
//			def apply( attributes: Attributes ): T = reflect( attributes )
//		}
//	}
//
//	trait Body[C <: Content] extends Empty
//	{
//		val content: C
//
//		override def toString =
//		{
//			"<" + tag + attributes + ( if( minimized && content.body.isEmpty ) " />" else ">" + content.body + "</" + tag + ">" )
//		}
//	}
//
//	object Body
//	{
//		trait Copyable extends Tag.Copyable
//		{
//			type T <: Tag.Body[_ <: Content]
//
//			def copy( tag: T, attributes: Attributes ): T = reflect( tag.attributes ~~ attributes, tag.content )
//		}
//
//		trait Appliable[C <: Content] extends Copyable
//		{
//			type T <: Tag.Body[C]
//
//			def apply( attributes: Attributes )( content: C ): T = reflect( attributes, content )
//
//			def apply( content: C ): T = apply( Attributes.empty )( content )
//		}
//	}
//}