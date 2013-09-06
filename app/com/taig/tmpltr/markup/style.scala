package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.templates.Txt

trait	style
extends	Tag.Body[style, Txt]
{
	val tag = "style"
}