package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	cite( attributes: Attributes )( content: Content )
extends	markup.cite[cite]( attributes )( content )
with	Helper.Default[cite]
{
	protected val helper = cite
}

object	cite
extends	Helper.DefaultCompanion[cite]
{
	def apply( attributes: Attributes )( content: Content ): cite = new cite( attributes )( content )
}