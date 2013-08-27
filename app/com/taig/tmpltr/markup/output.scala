package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	output
extends	Tag.Body[output, Content]
{
	val tag = "output"
}