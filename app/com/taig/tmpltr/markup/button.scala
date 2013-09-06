package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	button
extends	Tag.Body[button, Content]
{
	val tag = "button"
}