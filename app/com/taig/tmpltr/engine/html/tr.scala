package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tr( val attributes: Attributes )( val content: Content )
extends	markup.tr
with	Tag.Body[tr, Content]

object	tr
extends	Tag.Body.Appliable[tr, Content]