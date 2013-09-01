package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	pre( val attributes: Attributes, val content: Content )
extends	markup.pre
with	Tag.Body[pre, Content]

object	pre
extends	Tag.Body.Appliable[pre, Content]