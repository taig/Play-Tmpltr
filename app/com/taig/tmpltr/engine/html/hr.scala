package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

class	hr( attributes: Attributes )
extends	markup.hr[hr]( attributes )
with	Helper.Empty[hr]
{
	protected val helper = hr
}

object	hr
extends	Helper.EmptyCompanion[hr]
{
	def apply( attributes: Attributes = Attributes.empty ): hr = new hr( attributes )
}