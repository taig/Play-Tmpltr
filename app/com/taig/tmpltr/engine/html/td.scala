package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	td( attributes: Attributes )( content: Content )
extends	markup.td[td]( attributes )( content )
with	Helper.Default[td]
{
	protected val helper = td
}

object	td
extends	Helper.DefaultCompanion[td]
{
	def apply( attributes: Attributes )( content: Content ): td = new td( attributes )( content )
}