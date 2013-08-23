package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	body( attributes: Attributes )( content: Content )
extends	markup.body[body]( attributes )( content )
with	Helper.Default[body]
{
	protected val helper = com.taig.tmpltr.engine.html.body
}

object	body
extends	Helper.DefaultCompanion[body]
{
	def apply( attributes: Attributes )( content: Content ): body = new body( attributes )( content )
}