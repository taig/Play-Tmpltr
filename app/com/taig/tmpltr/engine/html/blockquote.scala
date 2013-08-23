package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	blockquote( attributes: Attributes )( content: Content )
extends	markup.blockquote[blockquote]( attributes )( content )
with	Helper.Default[blockquote]
{
	protected val helper = blockquote
}

object	blockquote
extends	Helper.DefaultCompanion[blockquote]
{
	def apply( attributes: Attributes )( content: Content ): blockquote = new blockquote( attributes )( content )
}