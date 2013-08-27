package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	body( val attributes: Attributes )( val content: Content )
extends	markup.body
with	Tag.Body[body, Content]

object	body
extends	Tag.Body.Appliable[body, Content]