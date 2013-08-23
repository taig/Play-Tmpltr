package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	thead( attributes: Attributes )( content: Content )
extends	markup.thead[thead]( attributes )( content )
with	Helper.Default[thead]
{
	protected val helper = thead
}

object	thead
extends	Helper.DefaultCompanion[thead]
{
	def apply( attributes: Attributes )( content: Content ): thead = new thead( attributes )( content )
}