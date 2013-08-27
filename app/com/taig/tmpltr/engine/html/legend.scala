package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	legend( val attributes: Attributes )( val content: Content )
extends	markup.legend
with	Tag.Body[legend, Content]

object	legend
extends	Tag.Body.Appliable[legend, Content]