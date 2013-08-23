package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	rt( attributes: Attributes )( content: Content )
extends	markup.rt[rt]( attributes )( content )
with	Helper.Default[rt]
{
	protected val helper = rt
}

object	rt
extends	Helper.DefaultCompanion[rt]
{
	def apply( attributes: Attributes )( content: Content ): rt = new rt( attributes )( content )
}