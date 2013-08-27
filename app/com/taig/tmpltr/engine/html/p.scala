package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	p( val attributes: Attributes )( val content: Content )
extends	markup.p
with	Tag.Body[p, Content]

object	p
extends	Tag.Body.Appliable[p, Content]