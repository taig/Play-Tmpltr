package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	label
extends	Tag.Body[label, Content]
{
	val tag = "label"
}