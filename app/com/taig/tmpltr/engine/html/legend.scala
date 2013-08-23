package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	legend( attributes: Attributes )( content: Content )
extends	markup.legend[legend]( attributes )( content )
with	Helper.Default[legend]
{
	protected val helper = legend
}

object	legend
extends	Helper.DefaultCompanion[legend]
{
	def apply( attributes: Attributes )( content: Content ): legend = new legend( attributes )( content )
}