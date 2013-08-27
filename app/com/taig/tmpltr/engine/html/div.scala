package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	div( val attributes: Attributes )( val content: Content )
extends	markup.div
with	Tag.Body[div, Content]

object	div
extends	Tag.Body.Appliable[div, Content]