package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	embed( val attributes: Attributes, val content: Content )
extends	markup.embed
with	Tag.Body[embed, Content]

object	embed
extends	Tag.Body.Appliable[embed, Content]