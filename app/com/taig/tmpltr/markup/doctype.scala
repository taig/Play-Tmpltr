package com.taig.tmpltr.markup

import com.taig.tmpltr._

trait	doctype
extends	Tag[doctype]
{
	val `type`: String

	override def toString = "<!DOCTYPE " + `type` + ">"
}