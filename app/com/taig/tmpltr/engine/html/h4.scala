package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h4( attributes: Attributes )( content: Content )
extends	h( 4, attributes )( content )
with	Tag.Body[h4, Content]

object	h4
extends	Tag.Body.Appliable[h4, Content]