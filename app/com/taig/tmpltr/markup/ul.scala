package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	ul
extends	Tag.Body[ul, Content]
{
	val tag = "ul"
}