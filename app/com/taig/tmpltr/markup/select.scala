package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	select
extends	Tag.Body[select, Content]
{
	val tag = "select"
}