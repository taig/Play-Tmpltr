package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	thead( val attributes: Attributes )( val content: Content )
extends	markup.thead
with	Tag.Body[thead, Content]

object	thead
extends	Tag.Body.Appliable[thead, Content]