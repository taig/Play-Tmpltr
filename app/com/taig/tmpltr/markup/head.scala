package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	head
extends	Tag.Body[head, Content]
{
	val tag = "head"
}