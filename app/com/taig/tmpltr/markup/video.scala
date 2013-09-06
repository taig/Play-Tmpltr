package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	video
extends	Tag.Body[video, Content]
{
	val tag = "video"
}