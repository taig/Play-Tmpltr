package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	cite
extends	Tag.Body[cite, Content]
{
	val tag = "cite"
}