package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	caption( val attributes: Attributes )( val content: Content )
extends	markup.caption
with	Tag.Body[caption, Content]

object	caption
extends	Tag.Body.Appliable[caption, Content]