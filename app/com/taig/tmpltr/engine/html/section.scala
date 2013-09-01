package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	section( val attributes: Attributes, val content: Content )
extends	markup.section
with	Tag.Body[section, Content]

object	section
extends	Tag.Body.Appliable[section, Content]