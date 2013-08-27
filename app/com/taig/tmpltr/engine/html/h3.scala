package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h3( val attributes: Attributes )( val content: Content )
extends	markup.h3
with	Tag.Body[h3, Content]

object	h3
extends	Tag.Body.Appliable[h3, Content]