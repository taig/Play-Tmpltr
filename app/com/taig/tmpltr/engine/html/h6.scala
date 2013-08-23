package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	h6( attributes: Attributes )( content: Content )
extends	markup.h[h6]( 6, attributes )( content )
with	Helper.Default[h6]
{
	protected val helper = h6
}

object	h6
extends	Helper.DefaultCompanion[h6]
{
	def apply( attributes: Attributes )( content: Content ): h6 = new h6( attributes )( content )
}