package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	audio( val attributes: Attributes )( val content: Content )
extends	markup.audio
with	Tag.Body[audio, Content]

object	audio
extends	Tag.Body.Appliable[audio, Content]