package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	caption( attributes: Attributes )( content: Content )
extends markup.caption[caption]( attributes )( content )
with	Helper.Default[caption]
{
	protected val helper = caption
}

object	caption
extends	Helper.DefaultCompanion[caption]
{
	def apply( attributes: Attributes )( content: Content ): caption = new caption( attributes )( content )
}