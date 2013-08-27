package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	u( val attributes: Attributes )( val content: Content )
extends	markup.u
with	Tag.Body[u, Content]

object	u
extends	Tag.Body.Appliable[u, Content]