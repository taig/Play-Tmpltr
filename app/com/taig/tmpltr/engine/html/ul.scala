package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ul( attributes: Attributes )( content: Content )
extends	markup.ul[ul]( attributes )( content )
with	Helper.Default[ul]
{
	protected val helper = ul
}

object	ul
extends	Helper.DefaultCompanion[ul]
{
	def apply( attributes: Attributes )( content: Content ): ul = new ul( attributes )( content )
}