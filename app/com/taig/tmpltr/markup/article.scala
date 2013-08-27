package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	article
extends	Tag.Body[article, Content]
{
	val tag = "article"
}