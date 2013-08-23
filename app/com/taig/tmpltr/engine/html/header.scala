package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	header( attributes: Attributes )( content: Content )
extends	markup.header[header]( attributes )( content )
with	Helper.Default[header]
{
	protected val helper = header
}

object	header
extends	Helper.DefaultCompanion[header]
{
	def apply( attributes: Attributes )( content: Content ): header = new header( attributes )( content )
}