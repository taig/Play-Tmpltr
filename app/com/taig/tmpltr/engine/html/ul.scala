package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ul( val attributes: Attributes )( val content: Content )
extends	markup.ul
with	Tag.Body[ul, Content]

object	ul
extends	Tag.Body.Appliable[ul, Content]