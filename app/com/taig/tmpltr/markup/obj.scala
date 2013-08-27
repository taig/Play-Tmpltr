package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	obj
extends	Tag.Body[obj, Content]
{
	val tag = "object"
}