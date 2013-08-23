package com.taig.tmpltr.markup

import com.taig.tmpltr._

abstract class	doctype[A <: doctype[A]]( `type`: String )
extends			Tag[A]( "!DOCTYPE", Attributes.empty )
{
	override def toString = "<" + label + " " + `type` + ">"
}