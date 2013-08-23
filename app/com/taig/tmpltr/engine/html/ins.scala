package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ins( attributes: Attributes )( content: Content )
extends	markup.ins[ins]( attributes )( content )
with	Helper.Default[ins]
{
	protected val helper = ins
}

object	ins
extends	Helper.DefaultCompanion[ins]
{
	def apply( attributes: Attributes )( content: Content ): ins = new ins( attributes )( content )
}