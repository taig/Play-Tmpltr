package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	em( val attributes: Attributes )( val content: Content )
extends	markup.em
with	Tag.Body[em, Content]

object	em
extends	Tag.Body.Appliable[em, Content]