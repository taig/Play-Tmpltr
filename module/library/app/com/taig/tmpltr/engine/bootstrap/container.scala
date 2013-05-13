package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	container( attributes: Attributes )( content: Html )
extends	markup.div[container]( attributes ++ ( "class" -> "container" ) )( content )
{
	protected def copy = new container( _: Attributes )( content )
}

object container
{
	def apply( attributes: (String, String)* )( content: Html ): container = new container( attributes )( content )

	def apply( content: Html ): container = apply()( content )
}