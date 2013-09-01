package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	footer( val attributes: Attributes, val content: Content )
extends	markup.footer
with	Tag.Body[footer, Content]

object	footer
extends	Tag.Body.Appliable[footer, Content]