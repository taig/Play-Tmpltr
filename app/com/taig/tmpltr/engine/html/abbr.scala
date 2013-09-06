package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	abbr( val attributes: Attributes, val content: Content )
extends	markup.abbr
with	Tag.Body[abbr, Content]

object	abbr
extends	Tag.Body.Appliable[abbr, Content]