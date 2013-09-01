package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	datalist( val attributes: Attributes, val content: Content )
extends	markup.datalist
with	Tag.Body[datalist, Content]

object	datalist
extends	Tag.Body.Appliable[datalist, Content]