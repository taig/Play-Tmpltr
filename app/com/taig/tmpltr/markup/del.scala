package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	del
extends	Tag.Body[del, Content]
{
	val tag = "del"
}