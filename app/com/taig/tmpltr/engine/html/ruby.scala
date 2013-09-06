package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ruby( val attributes: Attributes, val content: Content )
extends	markup.ruby
with	Tag.Body[ruby, Content]

object	ruby
extends	Tag.Body.Appliable[ruby, Content]