package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	tr
extends	Tag.Body[tr, Content]
{
	val tag = "tr"
}