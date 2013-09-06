package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	th
extends	Tag.Body[th, Content]
{
	val tag = "th"
}