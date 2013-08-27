package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	div
extends	Tag.Body[div, Content]
{
	val tag = "div"
}