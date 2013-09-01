package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	span( val attributes: Attributes, val content: Content )
extends	markup.span
with	Tag.Body[span, Content]

object	span
extends	Tag.Body.Appliable[span, Content]