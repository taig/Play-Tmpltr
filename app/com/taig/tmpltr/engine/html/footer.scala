package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	footer( attributes: Attributes )( content: Content )
extends	markup.footer[footer]( attributes )( content )
with	Helper.Default[footer]
{
	protected val helper = footer
}

object	footer
extends	Helper.DefaultCompanion[footer]
{
	def apply( attributes: Attributes )( content: Content ): footer = new footer( attributes )( content )
}