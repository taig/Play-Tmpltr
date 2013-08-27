package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.templates.Txt

trait	textarea
extends	Tag.Body[textarea, Txt]
{
	val tag = "textarea"
}