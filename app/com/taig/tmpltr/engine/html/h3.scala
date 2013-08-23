package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h3( attributes: Attributes )( content: Content )
extends	markup.h[h3]( 3, attributes )( content )
with	Helper.Default[h3]
{
	protected val helper = h3
}

object	h3
extends	Helper.DefaultCompanion[h3]
{
	def apply( attributes: Attributes )( content: Content ): h3 = new h3( attributes )( content )
}