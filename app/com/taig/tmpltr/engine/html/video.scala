package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	video( val attributes: Attributes )( val content: Content )
extends	markup.video
with	Tag.Body[video, Content]

object	video
extends	Tag.Body.Appliable[video, Content]