package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	thead
extends	Tag.Body[thead, Content]
{
	val tag = "thead"
}