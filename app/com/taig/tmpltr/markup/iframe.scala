package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	iframe
extends	Tag.Body[iframe, Content]
{
	val tag = "iframe"
}