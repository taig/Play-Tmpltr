package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	legend
extends	Tag.Body[legend, Content]
{
	val tag = "legend"
}