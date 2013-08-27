package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.templates.Txt

class	title( val attributes: Attributes )( val content: Txt )
extends	markup.title
with	Tag.Body[title, Txt]

object	title
extends	Tag.Body.Appliable[title, Txt]