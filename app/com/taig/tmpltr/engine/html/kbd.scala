package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	kbd( attributes: Attributes )( content: Content )
extends	markup.kbd[kbd]( attributes )( content )
with	Helper.Default[kbd]
{
	protected val helper = kbd
}

object	kbd
extends	Helper.DefaultCompanion[kbd]
{
	def apply( attributes: Attributes )( content: Content ): kbd = new kbd( attributes )( content )
}