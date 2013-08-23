package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	canvas( attributes: Attributes )( content: Content )
extends	markup.canvas[canvas]( attributes )( content )
with	Helper.Default[canvas]
{
	protected val helper = canvas
}

object	canvas
extends	Helper.DefaultCompanion[canvas]
{
	def apply( attributes: Attributes )( content: Content ): canvas = new canvas( attributes )( content )
}