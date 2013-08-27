package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	head( val attributes: Attributes )( val content: Content )
extends	markup.head
with	Tag.Body[head, Content]

object	head
extends	Tag.Body.Appliable[head, Content]