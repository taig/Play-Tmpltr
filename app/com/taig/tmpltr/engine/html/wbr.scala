package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	wbr( val attributes: Attributes )( val content: Content )
extends	markup.wbr
with	Tag.Body[wbr, Content]

object	wbr
extends	Tag.Body.Appliable[wbr, Content]