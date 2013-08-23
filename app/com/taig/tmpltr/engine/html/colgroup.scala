package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	colgroup( attributes: Attributes )( content: Content )
extends	markup.colgroup[colgroup]( attributes )( content )
with	Helper.Default[colgroup]
{
	protected val helper = colgroup
}

object	colgroup
extends	Helper.DefaultCompanion[colgroup]
{
	def apply( attributes: Attributes )( content: Content ): colgroup = new colgroup( attributes )( content )
}