package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	address( attributes: Attributes )( content: Content )
extends	markup.address[address]( attributes )( content )
with	Helper.Default[address]
{
	protected val helper = address
}

object	address
extends	Helper.DefaultCompanion[address]
{
	def apply( attributes: Attributes )( content: Content ): address = new address( attributes )( content )
}