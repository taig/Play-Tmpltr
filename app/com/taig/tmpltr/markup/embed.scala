package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	embed
extends	Tag.Body[embed, Content]
{
	val tag = "embed"
}