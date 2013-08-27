package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	html( val attributes: Attributes )( val content: Content )
extends	markup.html
with	Tag.Body[html, Content]

object	html
extends	Tag.Body.Appliable[html, Content]