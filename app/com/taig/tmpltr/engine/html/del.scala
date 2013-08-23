package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	del( attributes: Attributes )( content: Content )
extends	markup.del[del]( attributes )( content )
with	Helper.Default[del]
{
	protected val helper = del
}

object	del
extends	Helper.DefaultCompanion[del]
{
	def apply( attributes: Attributes )( content: Content ): del = new del( attributes )( content )
}