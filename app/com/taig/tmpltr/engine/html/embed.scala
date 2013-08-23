package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	embed( attributes: Attributes )( content: Content )
extends	markup.embed[embed]( attributes )( content )
with	Helper.Default[embed]
{
	protected val helper = embed
}

object	embed
extends	Helper.DefaultCompanion[embed]
{
	def apply( attributes: Attributes )( content: Content ): embed = new embed( attributes )( content )
}