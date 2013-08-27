package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	canvas
extends	Tag.Body[canvas, Content]
{
	val tag = "canvas"
}