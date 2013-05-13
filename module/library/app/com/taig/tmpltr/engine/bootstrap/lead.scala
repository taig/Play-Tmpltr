package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.templates.Html

class	lead( attributes: Attributes )( content: Html )
extends	markup.p[lead]( attributes )( content )
{
	protected def copy = new lead( _: Attributes )( content )
}

object lead
{
	def apply( attributes: (String, String)* )( content: Html ): lead =
	{
		new lead( attributes ++ ( "class" -> "lead" ) )( content )
	}

	def apply( content: Html ): lead = apply()( content )
}