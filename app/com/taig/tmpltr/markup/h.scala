package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	h
extends	Tag.Body[h, Content]
{
	val level: Int

	val tag = "h" + level
}