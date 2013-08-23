package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	sub( attributes: Attributes )( content: Content )
extends	markup.sub[sub]( attributes )( content )
with	Helper.Default[sub]
{
	protected val helper = sub
}

object	sub
extends Helper.DefaultCompanion[sub]
{
	def apply( attributes: Attributes )( content: Content ): sub = new sub( attributes )( content )
}