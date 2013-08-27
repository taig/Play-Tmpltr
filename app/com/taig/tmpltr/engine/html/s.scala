package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	s( val attributes: Attributes )( val content: Content )
extends	markup.s
with	Tag.Body[s, Content]

object	s
extends	Tag.Body.Appliable[s, Content]