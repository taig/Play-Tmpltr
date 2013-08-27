package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	progress
extends	Tag.Body[progress, Content]
{
	val tag = "progress"
}