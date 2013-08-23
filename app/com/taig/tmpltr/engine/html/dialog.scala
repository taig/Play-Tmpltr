package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	dialog( attributes: Attributes )( content: Content )
extends	markup.dialog[dialog]( attributes )( content )
with	Helper.Default[dialog]
{
	protected val helper = dialog
}

object	dialog
extends	Helper.DefaultCompanion[dialog]
{
	def apply( attributes: Attributes )( content: Content ): dialog = new dialog( attributes )( content )
}