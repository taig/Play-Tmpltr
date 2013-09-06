package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	sub( val attributes: Attributes, val content: Content )
extends	markup.sub
with	Tag.Body[sub, Content]

object	sub
extends	Tag.Body.Appliable[sub, Content]