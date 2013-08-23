package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h2( attributes: Attributes )( content: Content )
extends	markup.h[h2]( 2, attributes )( content )
with	Helper.Default[h2]
{
	protected val helper = h2
}

object	h2
extends	Helper.DefaultCompanion[h2]
{
	def apply( attributes: Attributes )( content: Content ): h2 = new h2( attributes )( content )
}