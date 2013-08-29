package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h6( attributes: Attributes )( content: Content )
extends	h( 6, attributes )( content )
with	Tag.Body[h6, Content]

object	h6
extends	Tag.Body.Appliable[h6, Content]