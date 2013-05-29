package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.templates.Html

class	page_header( level: Int, attributes: Attributes )( content: Html )
extends	markup.div[page_header]( attributes )( Html( new html.h( level, Attributes.empty )( content ).toString ) )
{
	protected def copy = new page_header( level, _: Attributes )( content )
}

object page_header
{
	def apply( level: Int = 1, attributes: Attributes = Attributes.empty )( content: Html ): page_header =
	{
		new page_header( level, attributes ++ ( "class" -> "page-header" ) )( content )
	}

	def apply( attributes: Attributes )( content: Html ): page_header = apply( 1, attributes )( content )

	def apply( content: Html ): page_header = apply( Attributes.empty )( content )
}