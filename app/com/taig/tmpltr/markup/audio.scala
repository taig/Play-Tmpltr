package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	audio
extends	Tag.Body[audio, Content]
{
	val tag = "audio"
}