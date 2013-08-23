package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	small( attributes: Attributes )( content: Content )
extends	markup.small[small]( attributes )( content )
with	Helper.Default[small]
{
	protected val helper = small
}

object	small
extends	Helper.DefaultCompanion[small]
{
	def apply( attributes: Attributes )( content: Content ): small = new small( attributes )( content )
}