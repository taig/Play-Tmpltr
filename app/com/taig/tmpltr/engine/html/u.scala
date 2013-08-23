package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	u( attributes: Attributes )( content: Content )
extends	markup.u[u]( attributes )( content )
with	Helper.Default[u]
{
	protected val helper = u
}

object	u
extends	Helper.DefaultCompanion[u]
{
	def apply( attributes: Attributes )( content: Content ): u = new u( attributes )( content )
}