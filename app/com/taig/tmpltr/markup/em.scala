package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	em
extends	Tag.Body[em, Content]
{
	val tag = "em"
}