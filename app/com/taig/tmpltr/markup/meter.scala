package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	meter
extends	Tag.Body[meter, Content]
{
	val tag = "meter"
}