package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	li
extends	Tag.Body[li, Content]
{
	val tag = "li"
}