package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	span( attributes: Attributes )( content: Content )
extends	markup.span[span]( attributes )( content )
with	Helper.Default[span]
{
	protected val helper = com.taig.tmpltr.engine.html.span
}

object	span
extends	Helper.DefaultCompanion[span]
{
	def apply( attributes: Attributes )( content: Content ): span = new span( attributes )( content )
}