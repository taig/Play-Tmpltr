package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.mvc.Content

trait	table
extends	Tag.Body[table, Content]
{
	val tag = "table"
}