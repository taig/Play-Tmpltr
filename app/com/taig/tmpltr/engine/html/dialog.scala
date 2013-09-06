package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dialog( val attributes: Attributes, val content: Content )
extends	markup.dialog
with	Tag.Body[dialog, Content]

object	dialog
extends	Tag.Body.Appliable[dialog, Content]