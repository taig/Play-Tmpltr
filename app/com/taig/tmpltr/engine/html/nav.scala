package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	nav( attributes: Attributes )( content: Content )
extends	markup.nav[nav]( attributes )( content )
with	Helper.Default[nav]
{
	protected val helper = nav
}

object	nav
extends	Helper.DefaultCompanion[nav]
{
	def apply( attributes: Attributes )( content: Content ): nav = new nav( attributes )( content )
}