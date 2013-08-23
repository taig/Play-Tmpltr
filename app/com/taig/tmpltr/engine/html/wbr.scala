package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	wbr( attributes: Attributes )( content: Content )
extends	markup.wbr[wbr]( attributes )( content )
with	Helper.Default[wbr]
{
	protected val helper = wbr
}

object	wbr
extends	Helper.DefaultCompanion[wbr]
{
	def apply( attributes: Attributes )( content: Content ): wbr = new wbr( attributes )( content )
}