package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	span
extends	Tag.Body[span, Content]
{
	val tag = "span"
}