package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	code( val attributes: Attributes )( val content: Content )
extends	markup.code
with	Tag.Body[code, Content]

object	code
extends	Tag.Body.Appliable[code, Content]