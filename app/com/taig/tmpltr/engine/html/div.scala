package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	div( attributes: Attributes )( content: Content )
extends	markup.div[div]( attributes )( content )
with	Helper.Default[div]
{
	protected val helper = div
}

object	div
extends	Helper.DefaultCompanion[div]
{
	def apply( attributes: Attributes )( content: Content ): div = new div( attributes )( content )
}