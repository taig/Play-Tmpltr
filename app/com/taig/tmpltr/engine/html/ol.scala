package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	ol( attributes: Attributes )( content: Content )
extends	markup.ol[ol]( attributes )( content )
with	Helper.Default[ol]
{
	protected val helper = ol
}

object	ol
extends	Helper.DefaultCompanion[ol]
{
	def apply( attributes: Attributes )( content: Content ): ol = new ol( attributes )( content )
}