package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h1( attributes: Attributes )( content: Content )
extends	markup.h[h1]( 1, attributes )( content )
with	Helper.Default[h1]
{
	protected val helper = h1
}

object	h1
extends	Helper.DefaultCompanion[h1]
{
	def apply( attributes: Attributes )( content: Content ): h1 = new h1( attributes )( content )
}