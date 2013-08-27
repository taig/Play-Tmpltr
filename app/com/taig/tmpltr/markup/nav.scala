package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	nav
extends	Tag.Body[nav, Content]
{
	val tag = "nav"
}