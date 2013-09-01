package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	figure( val attributes: Attributes, val content: Content )
extends	markup.figure
with	Tag.Body[figure, Content]

object	figure
extends	Tag.Body.Appliable[figure, Content]