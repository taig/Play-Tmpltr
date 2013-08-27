package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	ruby
extends	Tag.Body[ruby, Content]
{
	val tag = "ruby"
}