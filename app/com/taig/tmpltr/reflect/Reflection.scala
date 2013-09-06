package com.taig.tmpltr.reflect

import scala.reflect.runtime.universe._

trait Reflection

object Reflection
{
	lazy val mirror = runtimeMirror( getClass.getClassLoader )
}