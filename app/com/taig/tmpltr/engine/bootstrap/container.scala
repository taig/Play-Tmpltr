package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	container( attributes: Attributes, content: Content )
extends	html.div( attributes ~ ( "class" -> "container" ), content )
with	Tag.Body[container, Content]

object	container
extends	Tag.Body.Appliable[container, Content]