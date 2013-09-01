package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tfoot( val attributes: Attributes, val content: Content )
extends	markup.tfoot
with	Tag.Body[tfoot, Content]

object	tfoot
extends	Tag.Body.Appliable[tfoot, Content]