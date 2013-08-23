package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	details( attributes: Attributes )( content: Content )
extends	markup.details[details]( attributes )( content )
with	Helper.Default[details]
{
	protected val helper = details
}

object	details
extends	Helper.DefaultCompanion[details]
{
	def apply( attributes: Attributes )( content: Content ): details = new details( attributes )( content )
}