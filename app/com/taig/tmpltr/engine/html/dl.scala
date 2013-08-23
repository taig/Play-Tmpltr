package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dl( attributes: Attributes )( content: Content )
extends	markup.dl[dl]( attributes )( content )
with	Helper.Default[dl]
{
	protected val helper = dl
}

object	dl
extends	Helper.DefaultCompanion[dl]
{
	def apply( attributes: Attributes )( content: Content ): dl = new dl( attributes )( content )
}