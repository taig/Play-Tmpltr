package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	address
extends	Tag.Body[address, Content]
{
	val tag = "address"
}