package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	mark( attributes: Attributes )( content: Content )
extends	markup.mark[mark]( attributes )( content )
with	Helper.Default[mark]
{
	protected val helper = mark
}

object	mark
extends	Helper.DefaultCompanion[mark]
{
	def apply( attributes: Attributes )( content: Content ): mark = new mark( attributes )( content )
}