package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	source
extends	Tag.Body[source, Content]
{
	val tag = "source"
}