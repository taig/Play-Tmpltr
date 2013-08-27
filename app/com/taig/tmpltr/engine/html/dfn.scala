package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dfn( val attributes: Attributes )( val content: Content )
extends	markup.dfn
with	Tag.Body[dfn, Content]

object	dfn
extends	Tag.Body.Appliable[dfn, Content]