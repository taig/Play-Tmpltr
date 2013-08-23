package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h4( attributes: Attributes )( content: Content )
extends	markup.h[h4]( 4, attributes )( content )
with	Helper.Default[h4]
{
	protected val helper = h4
}

object	h4
extends	Helper.DefaultCompanion[h4]
{
	def apply( attributes: Attributes )( content: Content ): h4 = new h4( attributes )( content )
}