package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	details( val attributes: Attributes )( val content: Content )
extends	markup.details
with	Tag.Body[details, Content]

object	details
extends	Tag.Body.Appliable[details, Content]