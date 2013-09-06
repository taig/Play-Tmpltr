package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	header( val attributes: Attributes, val content: Content )
extends	markup.header
with	Tag.Body[header, Content]

object	header
extends	Tag.Body.Appliable[header, Content]