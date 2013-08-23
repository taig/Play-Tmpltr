package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dd( attributes: Attributes )( content: Content )
extends	markup.dd[dd]( attributes )( content )
with	Helper.Default[dd]
{
	protected val helper = dd
}

object	dd
extends	Helper.DefaultCompanion[dd]
{
	def apply( attributes: Attributes )( content: Content ): dd = new dd( attributes )( content )
}