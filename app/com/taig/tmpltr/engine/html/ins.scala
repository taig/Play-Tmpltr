package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ins( val attributes: Attributes, val content: Content )
extends	markup.ins
with	Tag.Body[ins, Content]

object	ins
extends	Tag.Body.Appliable[ins, Content]