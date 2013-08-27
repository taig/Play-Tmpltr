package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	abbr
extends	Tag.Body[abbr, Content]
{
	val tag = "abbr"
}