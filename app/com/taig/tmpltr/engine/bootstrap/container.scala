package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	container( attributes: Attributes )( content: Content )
extends	markup.div[container]( attributes ~ ( "class" -> "container" ) )( content )
with	Helper.Default[container]
{
	protected val helper = container
}

object	container
extends	Helper.DefaultCompanion[container]
{
	def apply( attributes: Attributes )( content: Content ) = new container( attributes )( content )
}