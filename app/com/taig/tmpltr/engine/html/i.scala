package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	i( val attributes: Attributes, val content: Content )
extends	markup.i
with	Tag.Body[i, Content]

object	i
extends	Tag.Body.Appliable[i, Content]