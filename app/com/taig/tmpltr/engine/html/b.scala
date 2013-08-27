package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	b( val attributes: Attributes )( val content: Content )
extends	markup.b
with	Tag.Body[b, Content]

object	b
extends	Tag.Body.Appliable[b, Content]