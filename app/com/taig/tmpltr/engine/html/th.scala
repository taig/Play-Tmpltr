package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	th( val attributes: Attributes )( val content: Content )
extends	markup.th
with	Tag.Body[th, Content]

object	th
extends	Tag.Body.Appliable[th, Content]