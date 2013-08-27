package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dl( val attributes: Attributes )( val content: Content )
extends	markup.dl
with	Tag.Body[dl, Content]

object	dl
extends	Tag.Body.Appliable[dl, Content]