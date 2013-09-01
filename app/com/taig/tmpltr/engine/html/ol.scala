package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ol( val attributes: Attributes, val content: Content )
extends	markup.ol
with	Tag.Body[ol, Content]

object	ol
extends	Tag.Body.Appliable[ol, Content]