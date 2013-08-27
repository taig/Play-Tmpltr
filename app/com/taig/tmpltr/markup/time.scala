package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	time
extends	Tag.Body[time, Content]
{
	val tag = "time"
}