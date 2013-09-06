package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	figcaption
extends	Tag.Body[figcaption, Content]
{
	val tag = "figcaption"
}