package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	blockquote
extends	Tag.Body[blockquote, Content]
{
	val tag = "blockquote"
}