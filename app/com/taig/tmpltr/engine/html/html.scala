package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	html( attributes: Attributes )( content: Content )
extends	markup.html[html]( attributes )( content )
with	Helper.Default[html]
{
	protected val helper = html
}

object	html
extends	Helper.DefaultCompanion[html]
{
	def apply( attributes: Attributes )( content: Content ): html = new html( attributes )( content )
}