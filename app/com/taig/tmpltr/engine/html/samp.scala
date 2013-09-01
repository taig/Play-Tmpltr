package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	samp( val attributes: Attributes, val content: Content )
extends	markup.samp
with	Tag.Body[samp, Content]

object	samp
extends	Tag.Body.Appliable[samp, Content]