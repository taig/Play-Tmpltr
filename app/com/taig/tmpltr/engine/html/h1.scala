package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h1( val attributes: Attributes )( val content: Content )
extends	markup.h1
with	Tag.Body[h1, Content]

object	h1
extends	Tag.Body.Appliable[h1, Content]