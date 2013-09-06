package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	summary
extends	Tag.Body[summary, Content]
{
	val tag = "summary"
}