package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	summary( val attributes: Attributes )( val content: Content )
extends	markup.summary
with	Tag.Body[summary, Content]

object	summary
extends	Tag.Body.Appliable[summary, Content]