package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	lead( attributes: Attributes )( content: Content )
extends	markup.p[lead]( attributes ~ ( "class" -> "lead" ) )( content )
with	Helper.Default[lead]
{
	protected val helper = lead
}

object	lead
extends	Helper.DefaultCompanion[lead]
{
	def apply( attributes: Attributes )( content: Content ) = new lead( attributes )( content )
}