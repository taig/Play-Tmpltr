package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	nav( val attributes: Attributes )( val content: Content )
extends	markup.nav
with	Tag.Body[nav, Content]

object	nav
extends	Tag.Body.Appliable[nav, Content]