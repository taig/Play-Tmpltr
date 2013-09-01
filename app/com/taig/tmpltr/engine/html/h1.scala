package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h1( attributes: Attributes, content: Content )
extends	h( 1, attributes, content )
with	Tag.Body[h1, Content]

object	h1
extends	Tag.Body.Appliable[h1, Content]