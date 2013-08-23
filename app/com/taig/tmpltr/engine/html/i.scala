package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	i( attributes: Attributes )( content: Content )
extends	markup.i[i]( attributes )( content )
with	Helper.Default[i]
{
	protected val helper = i
}

object	i
extends	Helper.DefaultCompanion[i]
{
	def apply( attributes: Attributes )( content: Content ): i = new i( attributes )( content )
}