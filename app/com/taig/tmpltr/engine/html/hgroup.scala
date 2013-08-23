package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	hgroup( attributes: Attributes )( content: Content )
extends	markup.hgroup[hgroup]( attributes )( content )
with	Helper.Default[hgroup]
{
	protected val helper = hgroup
}

object	hgroup
extends	Helper.DefaultCompanion[hgroup]
{
	def apply( attributes: Attributes )( content: Content ): hgroup = new hgroup( attributes )( content )
}