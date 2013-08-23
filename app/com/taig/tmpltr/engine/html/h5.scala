package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h5( attributes: Attributes )( content: Content )
extends	markup.h[h5]( 5, attributes )( content )
with	Helper.Default[h5]
{
	protected val helper = h5
}

object	h5
extends	Helper.DefaultCompanion[h5]
{
	def apply( attributes: Attributes )( content: Content ): h5 = new h5( attributes )( content )
}