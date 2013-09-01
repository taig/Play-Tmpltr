package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	colgroup( val attributes: Attributes, val content: Content )
extends	markup.colgroup
with	Tag.Body[colgroup, Content]

object	colgroup
extends	Tag.Body.Appliable[colgroup, Content]