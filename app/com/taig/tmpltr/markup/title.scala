package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.templates.Txt

trait	title
extends	Tag.Body[title, Txt]
{
	val tag = "title"
}