package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	q( val attributes: Attributes, val content: Content )
extends	markup.q
with	Tag.Body[q, Content]

object	q
extends	Tag.Body.Appliable[q, Content]