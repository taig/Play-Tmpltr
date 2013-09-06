package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	footer
extends	Tag.Body[footer, Content]
{
	val tag = "footer"
}