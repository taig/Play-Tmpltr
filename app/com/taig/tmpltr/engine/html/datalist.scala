package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	datalist( attributes: Attributes )( content: Content )
extends	markup.datalist[datalist]( attributes )( content )
with	Helper.Default[datalist]
{
	protected val helper = datalist
}

object	datalist
extends	Helper.DefaultCompanion[datalist]
{
	def apply( attributes: Attributes )( content: Content ): datalist = new datalist( attributes )( content )
}