package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	table( val attributes: Attributes )( val content: Content )
extends	markup.table
with	Tag.Body[table, Content]

object	table
extends	Tag.Body.Appliable[table, Content]