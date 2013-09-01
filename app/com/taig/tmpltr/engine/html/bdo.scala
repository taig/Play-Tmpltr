package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	bdo( val attributes: Attributes, val content: Content )
extends	markup.bdo
with	Tag.Body[bdo, Content]

object	bdo
extends	Tag.Body.Appliable[bdo, Content]