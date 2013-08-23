package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dt( attributes: Attributes )( content: Content )
extends	markup.dt[dt]( attributes )( content )
with	Helper.Default[dt]
{
	protected val helper = dt
}

object	dt
extends	Helper.DefaultCompanion[dt]
{
	def apply( attributes: Attributes )( content: Content ): dt = new dt( attributes )( content )
}