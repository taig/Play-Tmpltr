package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h5( val attributes: Attributes )( val content: Content )
extends	markup.h5
with	Tag.Body[h5, Content]

object	h5
extends	Tag.Body.Appliable[h5, Content]