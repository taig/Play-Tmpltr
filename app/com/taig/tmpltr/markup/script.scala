package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.templates.Txt

trait	script
extends	Tag.Body[script, Txt]
{
	val tag = "script"
}