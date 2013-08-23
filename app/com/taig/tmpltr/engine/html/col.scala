package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	col( attributes: Attributes )
extends	markup.col[col]( attributes )
with	Helper.Empty[col]
{
	protected val helper = col
}

object	col
extends	Helper.EmptyCompanion[col]
{
	def apply( attributes: Attributes = Attributes.empty ): col = new col( attributes )
}