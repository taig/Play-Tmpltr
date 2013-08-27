package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h2( val attributes: Attributes )( val content: Content )
extends	markup.h2
with	Tag.Body[h2, Content]

object	h2
extends	Tag.Body.Appliable[h2, Content]