package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	article( val attributes: Attributes, val content: Content )
extends	markup.article
with	Tag.Body[article, Content]

object	article
extends	Tag.Body.Appliable[article, Content]