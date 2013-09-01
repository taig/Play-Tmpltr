package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	td( val attributes: Attributes, val content: Content )
extends	markup.td
with	Tag.Body[td, Content]

object	td
extends	Tag.Body.Appliable[td, Content]