package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	figcaption( val attributes: Attributes, val content: Content )
extends	markup.figcaption
with	Tag.Body[figcaption, Content]

object	figcaption
extends	Tag.Body.Appliable[figcaption, Content]