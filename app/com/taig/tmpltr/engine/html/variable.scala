package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	variable( attributes: Attributes )( content: Content )
extends	markup.variable[variable]( attributes )( content )
with	Helper.Default[variable]
{
	protected val helper = variable
}

object	variable
extends	Helper.DefaultCompanion[variable]
{
	def apply( attributes: Attributes )( content: Content ): variable = new variable( attributes )( content )
}