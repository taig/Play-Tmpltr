package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	summary( attributes: Attributes )( content: Content )
extends	markup.summary[summary]( attributes )( content )
with	Helper.Default[summary]
{
	protected val helper = summary
}

object	summary
extends	Helper.DefaultCompanion[summary]
{
	def apply( attributes: Attributes )( content: Content ): summary = new summary( attributes )( content )
}