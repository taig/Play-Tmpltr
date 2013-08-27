package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dt( val attributes: Attributes )( val content: Content )
extends	markup.dt
with	Tag.Body[dt, Content]

object	dt
extends	Tag.Body.Appliable[dt, Content]