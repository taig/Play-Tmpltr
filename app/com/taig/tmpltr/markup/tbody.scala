package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	tbody
extends	Tag.Body[tbody, Content]
{
	val tag = "tbody"
}