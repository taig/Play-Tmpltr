package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	p( attributes: Attributes )( content: Content )
extends	markup.p[p]( attributes )( content )
with	Helper.Default[p]
{
	protected val helper = p
}

object	p
extends	Helper.DefaultCompanion[p]
{
	def apply( attributes: Attributes )( content: Content ): p = new p( attributes )( content )
}