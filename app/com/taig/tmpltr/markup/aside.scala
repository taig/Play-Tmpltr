package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	aside
extends	Tag.Body[aside, Content]
{
	val tag = "aside"
}