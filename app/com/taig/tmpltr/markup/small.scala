package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	small
extends	Tag.Body[small, Content]
{
	val tag = "small"
}