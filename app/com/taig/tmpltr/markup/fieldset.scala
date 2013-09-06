package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	fieldset
extends	Tag.Body[fieldset, Content]
{
	val tag = "fieldset"
}