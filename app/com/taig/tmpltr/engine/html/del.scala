package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	del( val attributes: Attributes, val content: Content )
extends	markup.del
with	Tag.Body[del, Content]

object	del
extends	Tag.Body.Appliable[del, Content]