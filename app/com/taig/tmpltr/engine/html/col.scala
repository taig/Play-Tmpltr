package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	col( val attributes: Attributes )
extends	markup.col
with	Tag.Empty[col]

object	col
extends	Tag.Empty.Appliable[col]