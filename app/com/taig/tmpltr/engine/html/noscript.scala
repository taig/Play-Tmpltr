package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	noscript( attributes: Attributes )( content: Content )
extends	markup.noscript[noscript]( attributes )( content )
with	Helper.Default[noscript]
{
	protected val helper = noscript
}

object	noscript
extends	Helper.DefaultCompanion[noscript]
{
	def apply( attributes: Attributes )( content: Content ): noscript = new noscript( attributes )( content )
}