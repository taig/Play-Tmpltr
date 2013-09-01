package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	sup( val attributes: Attributes, val content: Content )
extends	markup.sup
with	Tag.Body[sup, Content]

object	sup
extends	Tag.Body.Appliable[sup, Content]