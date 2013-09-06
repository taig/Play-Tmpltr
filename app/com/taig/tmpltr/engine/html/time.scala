package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	time( val attributes: Attributes, val content: Content )
extends	markup.time
with	Tag.Body[time, Content]

object	time
extends	Tag.Body.Appliable[time, Content]