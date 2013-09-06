package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	lead( attributes: Attributes, content: Content )
extends	html.p( attributes ~ ( "class" -> "lead" ), content )
with	Tag.Body[lead, Content]

object	lead
extends	Tag.Body.Appliable[lead, Content]