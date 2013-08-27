package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tbody( val attributes: Attributes )( val content: Content )
extends	markup.tbody
with	Tag.Body[tbody, Content]

object	tbody
extends	Tag.Body.Appliable[tbody, Content]