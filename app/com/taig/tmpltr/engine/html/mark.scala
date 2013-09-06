package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	mark( val attributes: Attributes, val content: Content )
extends	markup.mark
with	Tag.Body[mark, Content]

object	mark
extends	Tag.Body.Appliable[mark, Content]