package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	area( attributes: Attributes )
extends	markup.area[area]( attributes )
with	Helper.Empty[area]
{
	protected val helper = area
}

object	area
extends	Helper.EmptyCompanion[area]
{
	def apply( attributes: Attributes = Attributes.empty ): area = new area( attributes )
}