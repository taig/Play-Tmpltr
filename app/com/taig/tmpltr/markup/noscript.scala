package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	noscript
extends	Tag.Body[noscript, Content]
{
	val tag = "noscript"
}