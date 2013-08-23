package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	aside( attributes: Attributes )( content: Content )
extends	markup.aside[aside]( attributes )( content )
with	Helper.Default[aside]
{
	protected val helper = aside
}

object	aside
extends	Helper.DefaultCompanion[aside]
{
	def apply( attributes: Attributes )( content: Content ): aside = new aside( attributes )( content )
}