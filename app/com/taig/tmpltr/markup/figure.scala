package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	figure
extends	Tag.Body[figure, Content]
{
	val tag = "figure"
}