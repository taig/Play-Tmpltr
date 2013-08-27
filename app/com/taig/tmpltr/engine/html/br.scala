package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	br( val attributes: Attributes )
extends	markup.br
with	Tag.Empty[br]

object	br
extends br( Attributes.empty )
with	Tag.Empty.Appliable[br]