package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h3( attributes: Attributes )( content: Content )
extends	h( 3, attributes )( content )
with	Tag.Body[h3, Content]

object	h3
extends	Tag.Body.Appliable[h3, Content]