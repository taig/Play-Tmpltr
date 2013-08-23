package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	em( attributes: Attributes )( content: Content )
extends	markup.em[em]( attributes )( content )
with	Helper.Default[em]
{
	protected val helper = em
}

object	em
extends	Helper.DefaultCompanion[em]
{
	def apply( attributes: Attributes )( content: Content ): em = new em( attributes )( content )
}