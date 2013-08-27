package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	option
extends	Tag.Body[option, Content]
{
	val tag = "option"
}