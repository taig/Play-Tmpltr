package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	variable
extends	Tag.Body[variable, Content]
{
	val tag = "var"
}