package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	map
extends	Tag.Body[map, Content]
{
	val tag = "map"
}