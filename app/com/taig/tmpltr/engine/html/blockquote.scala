package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	blockquote( val attributes: Attributes, val content: Content )
extends	markup.blockquote
with	Tag.Body[blockquote, Content]

object	blockquote
extends	Tag.Body.Appliable[blockquote, Content]