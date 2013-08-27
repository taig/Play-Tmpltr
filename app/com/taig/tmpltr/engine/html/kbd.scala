package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	kbd( val attributes: Attributes )( val content: Content )
extends	markup.kbd
with	Tag.Body[kbd, Content]

object	kbd
extends	Tag.Body.Appliable[kbd, Content]