package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dfn( attributes: Attributes )( content: Content )
extends	markup.dfn[dfn]( attributes )( content )
with	Helper.Default[dfn]
{
	protected val helper = dfn
}

object	dfn
extends	Helper.DefaultCompanion[dfn]
{
	def apply( attributes: Attributes )( content: Content ): dfn = new dfn( attributes )( content )
}