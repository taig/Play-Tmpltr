package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	caption
extends	Tag.Body[caption, Content]
{
	val tag = "caption"
}