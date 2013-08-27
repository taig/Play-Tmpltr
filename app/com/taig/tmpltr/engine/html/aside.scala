package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	aside( val attributes: Attributes )( val content: Content )
extends	markup.aside
with	Tag.Body[aside, Content]

object	aside
extends	Tag.Body.Appliable[aside, Content]