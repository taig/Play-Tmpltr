package com.taig.tmpltr.engine.html

import com.taig.tmpltr.markup
import com.taig.tmpltr.Attributes

import play.api.templates.Html

class	iframe( src: Option[String], attributes: Attributes )( content: Html )
extends	markup.iframe[iframe]( attributes ++ Attributes( "src" -> src ) )( content )
{
	protected def copy = new iframe( src, _: Attributes )( content )
}

object iframe
{
	def apply( src: Option[String], attributes: Attributes )( content: Html ): iframe =
	{
		new iframe( src, attributes )( content )
	}

	def apply( attributes: Attributes )( content: Html ): iframe = apply( None, attributes )( content )

	def apply( content: Html ): iframe = apply( Attributes.empty )( content )
}