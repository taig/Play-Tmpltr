package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	html
extends	Tag.Body[html, Content]
{
	val tag = "html"
}