package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	fieldset( attributes: Attributes )( content: Content )
extends	markup.fieldset[fieldset]( attributes )( content )
with	Helper.Default[fieldset]
{
	protected val helper = fieldset
}

object	fieldset
extends	Helper.DefaultCompanion[fieldset]
{
	def apply( attributes: Attributes )( content: Content ): fieldset = new fieldset( attributes )( content )
}