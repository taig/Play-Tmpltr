package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	pre
extends	Tag.Body[pre, Content]
{
	val tag = "pre"
}