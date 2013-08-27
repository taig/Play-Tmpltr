package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	hgroup( val attributes: Attributes )( val content: Content )
extends	markup.hgroup
with	Tag.Body[hgroup, Content]

object	hgroup
extends	Tag.Body.Appliable[hgroup, Content]