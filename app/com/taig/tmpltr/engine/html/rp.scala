package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	rp( attributes: Attributes )( content: Content )
extends	markup.rp[rp]( attributes )( content )
with	Helper.Default[rp]
{
	protected val helper = rp
}

object	rp
extends	Helper.DefaultCompanion[rp]
{
	def apply( attributes: Attributes )( content: Content ): rp = new rp( attributes )( content )
}