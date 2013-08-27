package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	fieldset( val attributes: Attributes )( val content: Content )
extends	markup.fieldset
with	Tag.Body[fieldset, Content]

object	fieldset
extends	Tag.Body.Appliable[fieldset, Content]