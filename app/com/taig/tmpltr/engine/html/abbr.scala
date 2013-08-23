package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	abbr( attributes: Attributes )( content: Content )
extends	markup.abbr[abbr]( attributes )( content )
with	Helper.Default[abbr]
{
	protected val helper = abbr
}

object	abbr
extends	Helper.DefaultCompanion[abbr]
{
	def apply( attributes: Attributes )( content: Content ): abbr = new abbr( attributes )( content )
}