package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.templates.Html

class	caret( attributes: Attributes )
extends	html.b( attributes ~ ( "class" -> "caret" ), Html.empty )
with	Tag.Empty[caret]

object	caret
extends	Tag.Empty.Appliable[caret]