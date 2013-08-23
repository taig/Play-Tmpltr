package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	q( attributes: Attributes )( content: Content )
extends	markup.q[q]( attributes )( content )
with	Helper.Default[q]
{
	protected val helper = q
}

object	q
extends	Helper.DefaultCompanion[q]
{
	def apply( attributes: Attributes )( content: Content ): q = new q( attributes )( content )
}