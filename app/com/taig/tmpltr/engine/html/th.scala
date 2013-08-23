package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	th( attributes: Attributes )( content: Content )
extends	markup.th[th]( attributes )( content )
with	Helper.Default[th]
{
	protected val helper = th
}

object	th
extends	Helper.DefaultCompanion[th]
{
	def apply( attributes: Attributes )( content: Content ): th = new th( attributes )( content )
}