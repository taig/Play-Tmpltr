package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	video( attributes: Attributes )( content: Content )
extends	markup.video[video]( attributes )( content )
with	Helper.Default[video]
{
	protected val helper = video
}

object	video
extends	Helper.DefaultCompanion[video]
{
	def apply( attributes: Attributes )( content: Content ): video = new video( attributes )( content )
}