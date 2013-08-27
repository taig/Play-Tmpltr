package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	dt
extends	Tag.Body[dt, Content]
{
	val tag = "dt"
}