package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	rt( val attributes: Attributes, val content: Content )
extends	markup.rt
with	Tag.Body[rt, Content]

object	rt
extends	Tag.Body.Appliable[rt, Content]