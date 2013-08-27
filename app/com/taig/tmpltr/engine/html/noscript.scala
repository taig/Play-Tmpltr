package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	noscript( val attributes: Attributes )( val content: Content )
extends	markup.noscript
with	Tag.Body[noscript, Content]

object	noscript
extends	Tag.Body.Appliable[noscript, Content]