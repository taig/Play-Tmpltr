package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	b( attributes: Attributes )( content: Content )
extends	markup.b[b]( attributes )( content )
with	Helper.Default[b]
{
	protected val helper = b
}

object	b
extends	Helper.DefaultCompanion[b]
{
	def apply( attributes: Attributes )( content: Content ): b = new b( attributes )( content )
}