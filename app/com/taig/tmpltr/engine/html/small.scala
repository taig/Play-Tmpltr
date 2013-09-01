package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	small( val attributes: Attributes, val content: Content )
extends	markup.small
with	Tag.Body[small, Content]

object	small
extends	Tag.Body.Appliable[small, Content]