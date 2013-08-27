package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	form
extends	Tag.Body[form, Content]
{
	val tag = "form"
}