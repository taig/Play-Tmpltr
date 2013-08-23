package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	s( attributes: Attributes )( content: Content )
extends	markup.s[s]( attributes )( content )
with	Helper.Default[s]
{
	protected val helper = s
}

object	s
extends	Helper.DefaultCompanion[s]
{
	def apply( attributes: Attributes )( content: Content ): s = new s( attributes )( content )
}