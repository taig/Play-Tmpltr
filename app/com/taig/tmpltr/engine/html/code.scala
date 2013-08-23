package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	code( attributes: Attributes )( content: Content )
extends	markup.code[code]( attributes )( content )
with	Helper.Default[code]
{
	protected val helper = code
}

object	code
extends	Helper.DefaultCompanion[code]
{
	def apply( attributes: Attributes )( content: Content ): code = new code( attributes )( content )
}