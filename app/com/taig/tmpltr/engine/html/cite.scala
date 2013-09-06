package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	cite( val attributes: Attributes, val content: Content )
extends	markup.cite
with	Tag.Body[cite, Content]

object	cite
extends	Tag.Body.Appliable[cite, Content]