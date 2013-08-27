package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	li( val attributes: Attributes )( val content: Content )
extends	markup.li
with	Tag.Body[li, Content]

object	li
extends	Tag.Body.Appliable[li, Content]