package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait a extends Tag.Body[a, Content]
{
	val tag = "a"
}