package com.taig.tmpltr.markup

import com.taig.tmpltr.Tag

abstract class	doctype[A <: doctype[A]]( `type`: String )
extends			Tag[A]( "!DOCTYPE" )
{
	override def toString = "<" + label + " " + `type` + ">"
}