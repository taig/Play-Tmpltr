package com.taig.tmpltr.reflect

import Reflection.mirror

import scala.reflect.runtime.universe._

case class Companion[C]( companion: ModuleSymbol ) extends Reflection
{
	def this( `class`: java.lang.Class[_] ) = this( mirror.moduleSymbol( `class` ) )

	def this( name: String ) = this( mirror.staticModule( name ) )

	def getAccompanyingClass: Class[C] = Class[C]( companion.fullName )
}

object Companion
{
	def apply[C]( `class`: java.lang.Class[_] ): Companion[C] = new Companion[C]( `class` )

	def apply[C]( name: String ): Companion[C] = new Companion[C]( name )
}