package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tbody( attributes: Attributes )( content: Content )
extends	markup.tbody[tbody]( attributes )( content )
with	Helper.Default[tbody]
{
	protected val helper = tbody
}

object	tbody
extends	Helper.DefaultCompanion[tbody]
{
	def apply( attributes: Attributes )( content: Content ): tbody = new tbody( attributes )( content )
}