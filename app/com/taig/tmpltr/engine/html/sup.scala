package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	sup( attributes: Attributes )( content: Content )
extends	markup.sup[sup]( attributes )( content )
with	Helper.Default[sup]
{
	protected val helper = sup
}

object	sup
extends	Helper.DefaultCompanion[sup]
{
	def apply( attributes: Attributes )( content: Content ): sup = new sup( attributes )( content )
}