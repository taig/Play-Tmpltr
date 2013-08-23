package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	samp( attributes: Attributes )( content: Content )
extends	markup.samp[samp]( attributes )( content )
with	Helper.Default[samp]
{
	protected val helper = samp
}

object	samp
extends	Helper.DefaultCompanion[samp]
{
	def apply( attributes: Attributes )( content: Content ): samp = new samp( attributes )( content )
}