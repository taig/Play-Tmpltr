package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	figcaption( attributes: Attributes )( content: Content )
extends	markup.figcaption[figcaption]( attributes )( content )
with	Helper.Default[figcaption]
{
	protected val helper = figcaption
}

object	figcaption
extends	Helper.DefaultCompanion[figcaption]
{
	def apply( attributes: Attributes )( content: Content ): figcaption = new figcaption( attributes )( content )
}