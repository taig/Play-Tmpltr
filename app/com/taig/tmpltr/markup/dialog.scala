package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	dialog
extends	Tag.Body[dialog, Content]
{
	val tag = "dialog"
}