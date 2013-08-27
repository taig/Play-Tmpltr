package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	strong( val attributes: Attributes )( val content: Content )
extends	markup.strong
with	Tag.Body[strong, Content]

object	strong
extends	Tag.Body.Appliable[strong, Content]