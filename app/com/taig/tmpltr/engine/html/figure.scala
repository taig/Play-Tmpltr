package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	figure( attributes: Attributes )( content: Content )
extends	markup.figure[figure]( attributes )( content )
with	Helper.Default[figure]
{
	protected val helper = figure
}

object	figure
extends	Helper.DefaultCompanion[figure]
{
	def apply( attributes: Attributes )( content: Content ): figure = new figure( attributes )( content )
}