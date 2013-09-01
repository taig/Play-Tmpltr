package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h2( attributes: Attributes, content: Content )
extends	h( 2, attributes, content )
with	Tag.Body[h2, Content]

object	h2
extends	Tag.Body.Appliable[h2, Content]