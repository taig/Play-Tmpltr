package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tfoot( attributes: Attributes )( content: Content )
extends	markup.tfoot[tfoot]( attributes )( content )
with	Helper.Default[tfoot]
{
	protected val helper = tfoot
}

object	tfoot
extends	Helper.DefaultCompanion[tfoot]
{
	def apply( attributes: Attributes )( content: Content ): tfoot = new tfoot( attributes )( content )
}