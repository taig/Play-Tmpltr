package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	body
extends	Tag.Body[body, Content]
{
	val tag = "body"
}