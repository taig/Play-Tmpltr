package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	variable( val attributes: Attributes, val content: Content )
extends	markup.variable
with	Tag.Body[variable, Content]

object	variable
extends	Tag.Body.Appliable[variable, Content]