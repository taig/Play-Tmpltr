package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	li( attributes: Attributes )( content: Content )
extends	markup.li[li]( attributes )( content )
with	Helper.Default[li]
{
	protected val helper = li
}

object	li
extends	Helper.DefaultCompanion[li]
{
	def apply( attributes: Attributes )( content: Content ): li = new li( attributes )( content )
}