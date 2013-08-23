package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	strong( attributes: Attributes )( content: Content )
extends	markup.strong[strong]( attributes )( content )
with	Helper.Default[strong]
{
	protected val helper = strong
}

object	strong
extends	Helper.DefaultCompanion[strong]
{
	def apply( attributes: Attributes )( content: Content ): strong = new strong( attributes )( content )
}