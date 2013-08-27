package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	datalist
extends	Tag.Body[datalist, Content]
{
	val tag = "datalist"
}