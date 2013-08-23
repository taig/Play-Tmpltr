package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	section( attributes: Attributes )( content: Content )
extends	markup.section[section]( attributes )( content )
with	Helper.Default[section]
{
	protected val helper = section
}

object	section
extends	Helper.DefaultCompanion[section]
{
	def apply( attributes: Attributes )( content: Content ): section = new section( attributes )( content )
}