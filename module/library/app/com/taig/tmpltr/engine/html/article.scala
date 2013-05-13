package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	article( attributes: Attributes )( content: Html )
extends	markup.article[article]( attributes )( content )
{
	protected def copy = new article( _: Attributes )( content )
}

object article
{
	def apply( attributes: (String, String)* )( content: Html ): article = new article( attributes )( content )

	def apply( content: Html ): article = apply()( content )
}