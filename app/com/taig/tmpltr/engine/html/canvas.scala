package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	canvas( val attributes: Attributes, val content: Content )
extends	markup.canvas
with	Tag.Body[canvas, Content]

object	canvas
extends	Tag.Body.Appliable[canvas, Content]