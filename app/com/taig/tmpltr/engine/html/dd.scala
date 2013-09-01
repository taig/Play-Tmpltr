package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dd( val attributes: Attributes, val content: Content )
extends	markup.dd
with	Tag.Body[dd, Content]

object	dd
extends	Tag.Body.Appliable[dd, Content]