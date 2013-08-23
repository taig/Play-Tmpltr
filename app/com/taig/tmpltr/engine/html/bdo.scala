package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	bdo( attributes: Attributes )( content: Content )
extends markup.bdo[bdo]( attributes )( content )
with	Helper.Default[bdo]
{
	protected val helper = bdo
}

object	bdo
extends	Helper.DefaultCompanion[bdo]
{
	def apply( attributes: Attributes )( content: Content ): bdo = new bdo( attributes )( content )
}