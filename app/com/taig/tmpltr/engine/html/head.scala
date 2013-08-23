package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	head( attributes: Attributes )( content: Content )
extends	markup.head[head]( attributes )( content )
with	Helper.Default[head]
{
	protected val helper = com.taig.tmpltr.engine.html.head
}

object	head
extends	Helper.DefaultCompanion[head]
{
	def apply( attributes: Attributes )( content: Content ): head = new head( attributes )( content )
}