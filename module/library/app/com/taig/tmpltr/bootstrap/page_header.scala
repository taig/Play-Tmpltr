package com.taig.tmpltr.bootstrap

import com.taig.tmpltr._
import play.api.templates.Html
import com.taig.tmpltr.markup.h

class page_header(level: Int, attributes: Attributes)(content: Html) extends Tag.Html.Body.Division[page_header](
	attributes ++ ( "class" -> "page-header" )
)( Html( new h( level, attributes )( content ).toString ) )
{
	protected def copy = new page_header( level, _: Attributes )( content )
}

object page_header
{
	def apply(level: Int, attributes: (String, String)*)(content: Html): page_header =
	{
		new page_header( level, attributes )( content )
	}

	def apply(attributes: (String, String)*)(content: Html): page_header = apply( 1, attributes: _* )( content )

	def apply(content: Html): page_header = apply( )( content )
}