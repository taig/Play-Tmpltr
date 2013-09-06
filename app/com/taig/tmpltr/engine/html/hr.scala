package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	hr( val attributes: Attributes )
extends	markup.hr
with	Tag.Empty[hr]

object	hr
extends	hr( Attributes.empty )
with	Tag.Empty.Appliable[hr]