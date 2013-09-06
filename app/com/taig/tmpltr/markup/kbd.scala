package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	kbd
extends	Tag.Body[kbd, Content]
{
	val tag = "kbd"
}