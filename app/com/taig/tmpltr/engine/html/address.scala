package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	address( val attributes: Attributes, val content: Content )
extends	markup.address
with	Tag.Body[address, Content]

object	address
extends	Tag.Body.Appliable[address, Content]