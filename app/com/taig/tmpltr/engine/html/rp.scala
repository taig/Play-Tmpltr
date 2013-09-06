package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	rp( val attributes: Attributes, val content: Content )
extends	markup.rp
with	Tag.Body[rp, Content]

object	rp
extends	Tag.Body.Appliable[rp, Content]