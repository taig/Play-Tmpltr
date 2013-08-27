package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	details
extends	Tag.Body[details, Content]
{
	val tag = "details"
}