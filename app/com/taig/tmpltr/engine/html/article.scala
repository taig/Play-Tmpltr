package com.taig.tmpltr.engine.html

import com.taig.tmpltr._

import play.api.mvc.Content

class	article( attributes: Attributes )( content: Content )
extends	markup.article[article]( attributes )( content )
with	Helper.Default[article]
{
	protected val helper = article
}

object	article
extends	Helper.DefaultCompanion[article]
{
	def apply( attributes: Attributes )( content: Content ): article = new article( attributes )( content )
}