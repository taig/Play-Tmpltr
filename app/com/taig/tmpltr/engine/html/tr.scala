package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	tr( attributes: Attributes )( content: Content )
extends	markup.tr[tr]( attributes )( content )
with	Helper.Default[tr]
{
	protected val helper = tr
}

object	tr
extends	Helper.DefaultCompanion[tr]
{
	def apply( attributes: Attributes )( content: Content ): tr = new tr( attributes )( content )
}