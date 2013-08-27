package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	td
extends	Tag.Body[td, Content]
{
	val tag = "td"
}