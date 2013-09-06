package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	area( val attributes: Attributes )
extends	markup.area
with	Tag.Empty[area]

object	area
extends	Tag.Empty.Appliable[area]