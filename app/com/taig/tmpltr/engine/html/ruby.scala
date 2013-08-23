package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ruby( attributes: Attributes )( content: Content )
extends	markup.ruby[ruby]( attributes )( content )
with	Helper.Default[ruby]
{
	protected val helper = ruby
}

object	ruby
extends	Helper.DefaultCompanion[ruby]
{
	def apply( attributes: Attributes )( content: Content ): ruby = new ruby( attributes )( content )
}