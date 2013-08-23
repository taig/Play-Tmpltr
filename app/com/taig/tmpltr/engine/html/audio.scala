package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	audio( attributes: Attributes )( content: Content )
extends	markup.audio[audio]( attributes )( content )
with	Helper.Default[audio]
{
	protected val helper = audio
}

object	audio
extends	Helper.DefaultCompanion[audio]
{
	def apply( attributes: Attributes )( content: Content ): audio = new audio( attributes )( content )
}