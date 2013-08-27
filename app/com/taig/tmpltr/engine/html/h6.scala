package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h6( val attributes: Attributes )( val content: Content )
extends	markup.h6
with	Tag.Body[h6, Content]

object	h6
extends	Tag.Body.Appliable[h6, Content]