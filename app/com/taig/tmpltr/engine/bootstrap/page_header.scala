package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._

import play.api.mvc.Content

class	page_header( attributes: Attributes )( content: Content )
extends	markup.div[page_header]( attributes ~ ( "class" -> "page-header" ) )( content )
with	Helper.Default[page_header]
{
	protected val helper = page_header
}

object	page_header
extends	Helper.DefaultCompanion[page_header]
{
	def apply( attributes: Attributes )( content: Content ) = new page_header( attributes )( content )
}