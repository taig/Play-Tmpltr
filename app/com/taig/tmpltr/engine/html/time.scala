package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	time( attributes: Attributes )( content: Content )
extends	markup.time[time]( attributes )( content )
with	Helper.Default[time]
{
	protected val helper = time
}

object	time
extends	Helper.DefaultCompanion[time]
{
	def apply( attributes: Attributes )( content: Content ): time = new time( attributes )( content )
}